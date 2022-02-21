package com.neusoft.zywlzl.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neusoft.zywlzl.model.CnMedInfo;
import com.neusoft.zywlzl.mapper.CnMedInfoMapper;
@Service
public class CnMedInfoService{

    @Resource
    private CnMedInfoMapper cnMedInfoMapper;

    
    public int deleteByPrimaryKey(Integer medInfoId) {
        return cnMedInfoMapper.deleteByPrimaryKey(medInfoId);
    }

    
    public int insert(CnMedInfo record) {
        return cnMedInfoMapper.insert(record);
    }

    
    public int insertSelective(CnMedInfo record) {
        return cnMedInfoMapper.insertSelective(record);
    }

    
    public CnMedInfo selectByPrimaryKey(Integer medInfoId) {
        return cnMedInfoMapper.selectByPrimaryKey(medInfoId);
    }

    
    public int updateByPrimaryKeySelective(CnMedInfo record) {
        return cnMedInfoMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(CnMedInfo record) {
        return cnMedInfoMapper.updateByPrimaryKey(record);
    }

}