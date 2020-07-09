package com.chm.service.impl;

import com.chm.bean.Goods;
import com.chm.bean.GoodsSearchMap;
import com.chm.bean.RespObj;
import com.chm.mapper.GoodsMapper;
import com.chm.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /* 日志 */
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public List<Goods> findAll() {
        logger.info("查询商品列表");
        return goodsMapper.findAll();
    }

    @Override
    public List<Goods> search(Goods goods) {
        logger.info("条件搜索");
        return goodsMapper.search(goods);
    }

    @Override
    public Goods findById(Integer id) {
        logger.info("根据ID查询商品");
        return goodsMapper.findById(id);
    }

    @Override
    public RespObj saveGoods(Goods goods) {
        logger.info("添加商品");
        try {
            goodsMapper.saveGoods(goods);
            return RespObj.success("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespObj.error("添加失败");
        }
    }

    @Override
    public RespObj updateGoods(Goods goods) {
        logger.info("更新ID为" + goods.getId() + "的商品");
        try {
            goodsMapper.updateGoods(goods);
            return RespObj.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespObj.error("更新失败");
        }
    }

    @Override
    public RespObj deleteById(Integer id) {
        logger.info("删除ID为" + id + "的商品");
        try {
            goodsMapper.deleteById(id);
            return RespObj.success("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespObj.error("删除失败");
        }
    }
}
