package com.tataStrive.ecomm.repo;

import com.tataStrive.ecomm.entities.Product;
import com.tataStrive.ecomm.entities.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.*;


@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
    //finding by id or  name
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@Param("name")String name,Pageable pageable);


}
