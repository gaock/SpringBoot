package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.util.List;
@Mapper
public interface UserMapper {

    UserBean getInfo(String name,String password);

    List<UserBean> getAllData();

}
