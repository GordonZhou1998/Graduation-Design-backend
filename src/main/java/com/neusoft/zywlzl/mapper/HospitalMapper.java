package com.neusoft.zywlzl.mapper;

import com.neusoft.zywlzl.model.Hospital;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HospitalMapper {
    /**
     * delete by primary key
     * @param hospitalId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer hospitalId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Hospital record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Hospital record);

    /**
     * select by primary key
     * @param hospitalId primary key
     * @return object by primary key
     */
    Hospital selectByPrimaryKey(Integer hospitalId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Hospital record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Hospital record);

    List<Hospital> selectAll();

    List<Hospital> selectByName(String name);
}