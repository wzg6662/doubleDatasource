package com.example.demo.dao;


import com.example.demo.domain.Alcohol;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AlcoholDao {



    @Select("select * from alcohol  ")
    List<Alcohol> test();
}
