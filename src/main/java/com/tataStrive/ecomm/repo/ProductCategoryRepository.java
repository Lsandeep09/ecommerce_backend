package com.tataStrive.ecomm.repo;

import com.tataStrive.ecomm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductCategoryRepository extends JpaRepository<Product,Long> {
}
