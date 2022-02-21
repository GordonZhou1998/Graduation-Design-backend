package com.neusoft.zywlzl.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neusoft.zywlzl.model.CnMedInfoCategory;
import com.neusoft.zywlzl.mapper.CnMedInfoCategoryMapper;
@Service
public class CnMedInfoCategoryService{

    @Resource
    private CnMedInfoCategoryMapper cnMedInfoCategoryMapper;

    
    public int deleteByPrimaryKey(Integer categoryId) {
        return cnMedInfoCategoryMapper.deleteByPrimaryKey(categoryId);
    }

    
    public int insert(CnMedInfoCategory record) {
        return cnMedInfoCategoryMapper.insert(record);
    }

    
    public int insertSelective(CnMedInfoCategory record) {
        return cnMedInfoCategoryMapper.insertSelective(record);
    }

    
    public CnMedInfoCategory selectByPrimaryKey(Integer categoryId) {
        return cnMedInfoCategoryMapper.selectByPrimaryKey(categoryId);
    }

    
    public int updateByPrimaryKeySelective(CnMedInfoCategory record) {
        return cnMedInfoCategoryMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(CnMedInfoCategory record) {
        return cnMedInfoCategoryMapper.updateByPrimaryKey(record);
    }

}
