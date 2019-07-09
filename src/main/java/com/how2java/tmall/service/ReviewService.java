package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Review;

import java.util.List;

public interface ReviewService {

    void add(Review review);

    void delete(Integer id);

    void update(Review review);

    Review get(Integer id);

    List list(int pid);

    int getCount(Integer pid);
}
