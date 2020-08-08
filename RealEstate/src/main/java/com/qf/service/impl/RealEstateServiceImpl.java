package com.qf.service.impl;

import com.qf.dao.RealEstateMapper;
import com.qf.pojo.RealEstate;
import com.qf.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateServiceImpl implements RealEstateService {

    @Autowired
    private RealEstateMapper realEstateMapper;
    @Override
    public List<RealEstate> findAll() {
        return realEstateMapper.findAll();
    }


}
