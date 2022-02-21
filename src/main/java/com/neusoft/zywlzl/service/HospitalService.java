package com.neusoft.zywlzl.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neusoft.zywlzl.mapper.HospitalMapper;
import com.neusoft.zywlzl.model.Hospital;
@Service
public class HospitalService{

    @Resource
    private HospitalMapper hospitalMapper;

    
    public int deleteByPrimaryKey(Integer hospitalId) {
        return hospitalMapper.deleteByPrimaryKey(hospitalId);
    }

    
    public int insert(Hospital record) {
        return hospitalMapper.insert(record);
    }

    
    public int insertSelective(Hospital record) {
        return hospitalMapper.insertSelective(record);
    }

    
    public Hospital selectByPrimaryKey(Integer hospitalId) {
        return hospitalMapper.selectByPrimaryKey(hospitalId);
    }

    
    public int updateByPrimaryKeySelective(Hospital record) {
        return hospitalMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Hospital record) {
        return hospitalMapper.updateByPrimaryKey(record);
    }

}
