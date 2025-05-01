package com.gk.Ecommerce.Repo;

import com.gk.Ecommerce.Entity.Product;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

//    @Query("SELECT p from Product p WHERE "+
//            "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR "+
//            "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR "+
//            "LOWER(p.desc) LIKE LOWER(CONCAT('%', :keyword, '%')) OR "+
//            "LOWER(p.category) LOWER(CONCAT('%', :keyword, '%')) ")
//    List<Product> searchProducts(String keyword);




//
//    public List<Product> findByBrand(String brand);
//
//    @Query()
//    List<Product> searchProducts(String keyword);
}