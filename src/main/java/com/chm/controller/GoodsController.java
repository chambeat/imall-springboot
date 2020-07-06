package com.chm.controller;

import com.chm.bean.Goods;
import com.chm.bean.RespObj;
import com.chm.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // 直接返回JSON
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/{currentPage}")
    public PageInfo<Goods> list(@PathVariable("currentPage") Integer currentPage) {
        /* 注意：'PageHelper.startPage()'必须写在'待执行SQL'前面，否则会造成分页失效。（坑！） */
        PageHelper.startPage(currentPage, 10);
        List<Goods> originalList = goodsService.findAll();
        return new PageInfo<>(originalList);
    }

    /*
     * 使用PageHelper分页插件：
     *     关于分页的逻辑，仅在Controller类中指定即可，业务层不作任何改动。（菜鸟掉坑！！）
     */
    @PostMapping("/goods/search/{currentPage}")
    public PageInfo<Goods> search(@RequestBody Goods goods,
                                  @PathVariable("currentPage") Integer currentPage) {
        PageHelper.startPage(currentPage, 10);
        List<Goods> originalList = goodsService.search(goods);
        return new PageInfo<>(originalList);
    }

    @GetMapping("/goods/single/{id}")
    public Goods findById(@PathVariable("id") Integer id) {
        return goodsService.findById(id);
    }

    /*
     * 注意：
     *     由于save()方法要接收前端传过来的JSON对象(参数)，因此需要添加@RequestBody注解。
     *     当Goods对象上缺少@RequestBody注解时，后端便无法接收到参数。（坑！）
     */
    @PostMapping("/goods")
    public RespObj save(@RequestBody Goods goods) {
        return goodsService.saveGoods(goods);
    }

    @PutMapping("/goods")
    public RespObj update(@RequestBody Goods goods) {
        return goodsService.updateGoods(goods);
    }

    @DeleteMapping("/goods/{id}")
    public RespObj delete(@PathVariable("id") Integer id) {
        return goodsService.deleteById(id);
    }
}
