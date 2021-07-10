package com.cafe.menu.repository;


import java.util.Optional;

import com.cafe.menu.models.entity.Dishes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepository extends JpaRepository<Dishes, String> {
  void deleteDishesById(String id);

  Optional <Dishes> findDishesById(String id);
}