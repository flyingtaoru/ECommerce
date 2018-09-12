package com.nice.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nice.dao.TbBrandMapper;
import com.nice.pojo.TbBrand;
import com.nice.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {

        return brandMapper.selectByExample(null);
    }

}