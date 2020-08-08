package com.qf.dao;

import com.qf.pojo.RealEstate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealEstateMapper {
    List<RealEstate> findAll();
}
