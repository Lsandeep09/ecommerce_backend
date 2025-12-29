package com.tataStrive.ecomm.repo;

import com.tataStrive.ecomm.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<ProductCategory,Long> {
}
