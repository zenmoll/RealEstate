package com.qf.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.RealEstate;
import com.qf.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("realEstate")
public class RealEstateController {
    @Autowired
    private RealEstateService realEstateService;

    @RequestMapping("findAll")
    public Map findAll(Integer page,Integer limit) {

        PageHelper.startPage(page, limit);
        List<RealEstate> realEstates = realEstateService.findAll();
        System.out.println(realEstates);
        PageInfo<RealEstate> pageInfo = new PageInfo<>(realEstates);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;


    }
}
