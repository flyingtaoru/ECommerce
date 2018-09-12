package com.nice.sellergoods.service;

import com.nice.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

    public List<TbBrand> findAll();

}