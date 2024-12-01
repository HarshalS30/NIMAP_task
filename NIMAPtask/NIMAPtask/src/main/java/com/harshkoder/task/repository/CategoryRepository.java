package com.harshkoder.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.harshkoder.task.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}