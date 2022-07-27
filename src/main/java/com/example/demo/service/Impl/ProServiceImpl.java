package com.example.demo.service.Impl;

import com.example.demo.mapper.ProMapper;
import com.example.demo.service.ProService;
import org.springframework.stereotype.Service;

/**
 * @Author xun
 * @create 2022/7/19 16:34
 */
@Service
public class ProServiceImpl implements ProService {

    private final ProMapper proMapper;
    public ProServiceImpl(ProMapper proMapper) {
        this.proMapper = proMapper;
    }

    @Override
    public Integer findProId(String proName) {
        return proMapper.selectProName(proName);
    }
    @Override
    public void insertProduct(String proName) {
        proMapper.insertPro(proName);
        System.out.println("插入" + proName);
    }
    @Override
    public void deleteProduct(String proName) {
        proMapper.deletePro(proName);
        System.out.println("删除" + proName);
    }
    @Override
    public void deleteProductById(Integer proId) {
        proMapper.deleteProId(proId);
        System.out.println("删除" + proId);
    }


}
