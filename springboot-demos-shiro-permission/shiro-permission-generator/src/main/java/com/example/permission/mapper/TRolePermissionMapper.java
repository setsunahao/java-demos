package com.example.permission.mapper;

import com.example.permission.entity.TRolePermission;

public interface TRolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int insert(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int insertSelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    TRolePermission selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int updateByPrimaryKeySelective(TRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated Wed Aug 01 17:03:43 CST 2018
     */
    int updateByPrimaryKey(TRolePermission record);
}