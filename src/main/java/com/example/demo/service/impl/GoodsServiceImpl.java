package com.example.demo.service.impl;

import com.example.demo.dao.GoodsDao;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> querryAll() {
        return goodsDao.querryAll();
    }

    @Override
    public int queryIsLike(int gid, int uid) {
        return goodsDao.queryIsLike(gid,uid);
    }


}
