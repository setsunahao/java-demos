package com.example.permission.mapper;

import com.example.permission.entity.Customer;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    Customer selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int updateByPrimaryKey(Customer record);
}