package com.cafe.menu.service;

import java.util.List;
import java.util.UUID;

import com.cafe.menu.exeption.UserNotFoundExeption;
import com.cafe.menu.models.entity.Dishes;
import com.cafe.menu.repository.MenuRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService{
  private final MenuRepository menuRepo;
@Autowired
  public MenuService(MenuRepository menuRepo) {
    this.menuRepo = menuRepo;
  }

  public Dishes addDishes(Dishes dishes){
    dishes.setDishesCode(UUID.randomUUID().toString());
    return menuRepo.save(dishes);
  }

  public List<Dishes> findAllDisheses(){
    return menuRepo.findAll();
  }
  public Dishes updateDishes(Dishes dishes){
    return menuRepo.save(dishes);
  }
  public Dishes findDishesById(String id){
    return menuRepo.findDishesById(id).orElseThrow(() -> new UserNotFoundExeption("User by id " + id + " was not found"));
  }

  public void deleteDishes(String id){
    menuRepo.deleteDishesById(id);
  }
  
}