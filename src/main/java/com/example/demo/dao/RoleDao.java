package com.example.demo.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.demo.domain.BsRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@DS(value = "a02")
public interface RoleDao {

    @Select("select * from bs_role")
    List<BsRole> getRoleinfo();
}
