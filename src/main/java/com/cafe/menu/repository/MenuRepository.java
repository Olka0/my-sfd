package com.cafe.menu.repository;


import java.util.Optional;


import com.cafe.menu.models.entity.Dishes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepository extends JpaRepository<Dishes, String> {


  Optional <Dishes> findByGeneratedId(int id);

 

  void deleteDishesById(String id);
}