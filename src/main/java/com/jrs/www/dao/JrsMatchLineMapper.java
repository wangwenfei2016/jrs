package com.jrs.www.dao;

import com.jrs.www.po.JrsMatchLine;
import java.util.List;

public interface JrsMatchLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_line
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_line
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int insert(JrsMatchLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_line
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    JrsMatchLine selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_line
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    List<JrsMatchLine> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jrs_match_line
     *
     * @mbg.generated Fri Jun 01 16:07:07 GMT+08:00 2018
     */
    int updateByPrimaryKey(JrsMatchLine record);
}