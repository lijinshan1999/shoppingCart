package com.example.demo.dao;

import com.example.demo.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {

    List<Goods> querryAll();

    int queryIsLike(int gid, int uid);
}
