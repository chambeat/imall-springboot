package com.chm.service;

import com.chm.bean.Goods;
import com.chm.bean.GoodsSearchMap;
import com.chm.bean.RespObj;

import java.util.List;

public interface GoodsService {

    List<Goods> findAll();

    List<Goods> search(Goods goods);

    Goods findById(Integer id);

    RespObj saveGoods(Goods goods);

    RespObj updateGoods(Goods goods);

    RespObj deleteById(Integer id);
}
