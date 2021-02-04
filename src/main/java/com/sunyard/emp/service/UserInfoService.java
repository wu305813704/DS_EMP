package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.UserInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunyard.emp.exception.BaseException;

/**
 * 用户信息
 *
 * @author KouKi
 * @version 2021-02-04 15:37:42
 */
public interface UserInfoService extends IService<UserInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param userInfo 查询条件
    * @return 根据查询条件查出的用户信息列表
    */
    IPage<UserInfo> queryList(Page<UserInfo> page, UserInfo userInfo);

    String login(UserInfo userInfo) throws BaseException;

    void logout(String token) throws BaseException;
}

