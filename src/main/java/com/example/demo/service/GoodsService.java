package com.example.demo.service;

import com.example.demo.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> querryAll();

    int queryIsLike(int gid, int uid);
}
