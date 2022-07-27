package com.example.demo.service;

/**
 * @Author xun
 * @create 2022/7/19 16:33
 */
public interface ProService {
     Integer findProId(String proName);
     void insertProduct(String proName);
     void deleteProduct(String proName);
     void deleteProductById(Integer proId);
}
