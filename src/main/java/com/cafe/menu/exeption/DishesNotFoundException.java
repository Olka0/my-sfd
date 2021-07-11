package com.cafe.menu.exeption;

public class DishesNotFoundException extends RuntimeException{
  public DishesNotFoundException(String message) {
    super(message);
  }
}
