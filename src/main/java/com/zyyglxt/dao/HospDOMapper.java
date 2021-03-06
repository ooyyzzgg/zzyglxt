package com.zyyglxt.dao;

import com.zyyglxt.dataobject.HospDO;
import com.zyyglxt.dataobject.HospDOKey;

public interface HospDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(HospDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(HospDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(HospDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    HospDO selectByPrimaryKey(HospDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(HospDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(HospDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_hosp
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(HospDO record);
}