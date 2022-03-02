package com.neusoft.zywlzl.mapper;

import com.neusoft.zywlzl.model.CnMedInfoCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CnMedInfoCategoryMapper {
    /**
     * delete by primary key
     * @param categoryId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer categoryId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CnMedInfoCategory record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CnMedInfoCategory record);

    /**
     * select by primary key
     * @param categoryId primary key
     * @return object by primary key
     */
    CnMedInfoCategory selectByPrimaryKey(Integer categoryId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CnMedInfoCategory record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CnMedInfoCategory record);

    List<CnMedInfoCategory> selectAll();
}