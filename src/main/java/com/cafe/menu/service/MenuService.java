package com.cafe.menu.service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import com.cafe.menu.exeption.DishesNotFoundException;
import com.cafe.menu.models.entity.Dishes;
import com.cafe.menu.repository.MenuRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class MenuService{
  private final MenuRepository menuRepo;
  private static final Logger LOGGER = Logger.getLogger(MenuService.class.getName());
  @Autowired
  public MenuService(MenuRepository menuRepo) {
      this.menuRepo = menuRepo;
  }

  public Dishes addDishes(Dishes dishes) {
      dishes.setDishesCode(UUID.randomUUID().toString());
      LOGGER.info("saved dishes with name : "+ dishes.getName());
      return menuRepo.save(dishes);
  }

  public List<Dishes> findAllDisheses() {
      LOGGER.info("found all dishes ");
      return menuRepo.findAll();
  }



    public Dishes updateDishes(Dishes dishes) {
      Dishes rez = menuRepo.findByGeneratedId(dishes.getGeneratedId()).orElseThrow(()
          -> new DishesNotFoundException("dishes with id " + dishes.getGeneratedId() + " was not found"));

      rez.setPrice(dishes.getPrice());
      rez.setDescription(dishes.getDescription());
      rez.setName(dishes.getName());
      LOGGER.info("updated dishes with name : "+ dishes.getName());
      return menuRepo.save(dishes);
  }

  public Dishes findDishesById(int id) {
      Dishes rez = menuRepo.findByGeneratedId(id).orElseThrow(()
          -> new DishesNotFoundException("Dishes with id " + id + " was not found"));
      LOGGER.info("found dishes with name : "+ rez.getName());
      return rez;
  }

  public void deleteDishes(int id) {
      Dishes restoredDishes = menuRepo.findByGeneratedId(id).orElseThrow(()
          -> new DishesNotFoundException("Dishes with id " + id + " was not found"));
      LOGGER.info("deleted dishes with name : "+ restoredDishes.getName());
      menuRepo.delete(restoredDishes);
  }

}
