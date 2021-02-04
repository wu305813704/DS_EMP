package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 用户信息
 *
 * @author KouKi
 * @version 2021-02-04 15:37:42
 */
@Mapper
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param userInfo 查询条件
     * @return 根据查询条件查出的用户信息列表
     */
    IPage<UserInfo> query(Page<UserInfo> page, @Param("userInfo") UserInfo userInfo);
}
