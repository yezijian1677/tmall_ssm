package com.how2java.tmall.service;

import com.how2java.tmall.pojo.ProductImage;

import java.util.List;

public interface ProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage productImage);

    void delete(Integer id);

    void update(ProductImage productImage);

    ProductImage get(Integer id);

    List list(int pid, String type);
}
