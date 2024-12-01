package com.harshkoder.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.harshkoder.task.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}