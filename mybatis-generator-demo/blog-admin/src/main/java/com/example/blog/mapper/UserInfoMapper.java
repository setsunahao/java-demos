package com.example.blog.mapper;

import com.example.blog.entity.UserInfo;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    UserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    int updateByPrimaryKey(UserInfo record);
}