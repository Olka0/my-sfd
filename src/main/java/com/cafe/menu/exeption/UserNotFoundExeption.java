package com.cafe.menu.exeption;

public class UserNotFoundExeption extends RuntimeException{
  public UserNotFoundExeption(String message) {
    super(message);
  }
}
