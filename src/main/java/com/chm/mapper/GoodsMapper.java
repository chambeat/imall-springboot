package com.chm.mapper;

import com.chm.bean.Goods;
import com.chm.bean.GoodsSearchMap;

import java.util.List;

public interface GoodsMapper {

    List<Goods> findAll();

    List<Goods> search(Goods goods);

    Goods findById(Integer id);

    int saveGoods(Goods goods);

    int updateGoods(Goods goods);

    int deleteById(Integer id);
}
