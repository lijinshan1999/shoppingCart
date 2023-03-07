package com.example.demo.controller;

import com.example.demo.dto.Result;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("getGoods")
    public Result getGoods(){
        Result result = new Result();
        List<Goods> goods = goodsService.querryAll();
        if (goods != null){
            result.setState(Result.OK);
            result.setMsg("商品数据获取成功");
            result.setData(goods);
        } else {
            result.setState(Result.ERROR);
            result.setMsg("商品数据获取失败");
        }
        return result;
    }

    //点赞
    @RequestMapping("like")
    public Result like(String gid, String uid){
        Result result = new Result();
        gid = "1";
        uid = "2";
       int isLike = goodsService.queryIsLike(Integer.parseInt(gid),Integer.parseInt(uid));
        System.out.println(isLike);
        return result;
    }


}
