package com.example.demo.controller;

import com.example.demo.dao.AlcoholDao;
import com.example.demo.dao.RoleDao;
import com.example.demo.domain.Alcohol;
import com.example.demo.domain.BsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private  AlcoholDao alcoholDao;

    @Autowired
    private RoleDao roleDao;


    @RequestMapping("test")
    public Object test(){
        List<Alcohol> test = alcoholDao.test();
        for (Alcohol alc:test
        ) {
            System.out.println(alc);
        }
        return test;
    }

    @RequestMapping("test2")
    public Object test2(){
        List<BsRole> test = roleDao.getRoleinfo();
        for (BsRole alc:test
        ) {
            System.out.println(alc);
        }
        return test;
    }


}
