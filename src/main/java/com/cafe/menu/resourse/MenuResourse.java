package com.cafe.menu.resourse;

import java.util.List;

import com.cafe.menu.models.entity.Dishes;
import com.cafe.menu.service.MenuService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/dishes")
public class MenuResourse{
  private final MenuService menuService;


  public MenuResourse (MenuService menuService){
    this.menuService = menuService;
  }
  @GetMapping("/all")
  public ResponseEntity<List<Dishes>> getAllDishes (){
    List<Dishes> disheses = menuService.findAllDisheses();
    return new ResponseEntity<>(disheses, HttpStatus.OK);
      }
      @GetMapping("/find/{id}")
  public ResponseEntity<Dishes> getAllDishesById (@PathVariable("id") String id){
    Dishes dishes = menuService.findDishesById(id);
    return new ResponseEntity<>(dishes, HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<Dishes> addDishes(@RequestBody Dishes dishes) {
  Dishes newDishes = menuService.addDishes(dishes);
  return new ResponseEntity<>(newDishes, HttpStatus.CREATED);
}

@PutMapping("/update")
public ResponseEntity<Dishes> updateDishes(@RequestBody Dishes dishes) {
  Dishes updateDishes = menuService.updateDishes(dishes);
  return new ResponseEntity<>(updateDishes, HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDishes(@PathVariable("id") String id) {
        menuService.deleteDishes(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
  