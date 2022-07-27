package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author xun
 * @create 2022/7/19 16:35
 */
@Mapper
public interface ProMapper {
    // 具体的sql文件在该mapper的同名文件中
    Integer selectProName(@Param("proName") String proName);
     void insertPro(String proName);
     void deletePro(String proName);
     void deleteProId(Integer proId);
}
