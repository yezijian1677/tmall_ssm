package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);

    void delete(Integer id);

    void update(Product product);

    Product get(Integer id);

    List list(Integer cid);

    void setFirstProductImage(Product p);

    void fill(List<Category> categoryList);

    void fill(Category category);

    void fillByRow(List<Category> categoryList);

    void setSaleAndReviewNumber(Product product);

    void setSaleAndReviewNumber(List<Product> products);

    List<Product> search(String keyword);

}
