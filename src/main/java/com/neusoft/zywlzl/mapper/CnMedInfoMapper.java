package com.neusoft.zywlzl.mapper;

import com.neusoft.zywlzl.model.CnMedInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CnMedInfoMapper {
    /**
     * delete by primary key
     * @param medInfoId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer medInfoId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CnMedInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CnMedInfo record);

    /**
     * select by primary key
     * @param medInfoId primary key
     * @return object by primary key
     */
    CnMedInfo selectByPrimaryKey(Integer medInfoId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CnMedInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CnMedInfo record);

    List<CnMedInfo> selectAll();

    int selectCount();

    List<CnMedInfo> selectByPage(int start, int rows);

    List<CnMedInfo> selectByKeyword(String keyword);
}