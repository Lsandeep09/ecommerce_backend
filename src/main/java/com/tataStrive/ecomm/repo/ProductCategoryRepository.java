package com.tataStrive.ecomm.repo;

import com.tataStrive.ecomm.entities.Product;
import com.tataStrive.ecomm.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category",exported = true)

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
