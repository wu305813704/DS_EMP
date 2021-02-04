package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunyard.emp.exception.BaseException;
import com.sunyard.emp.utils.TokenMap;
import com.sunyard.emp.utils.TokenUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.UserInfoMapper;
import com.sunyard.emp.entity.UserInfo;
import com.sunyard.emp.service.UserInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;

/**
 * 用户信息
 *
 * @author KouKi
 * @version 2021-02-04 15:37:42
 */
@Transactional
@Service("userInfoService")
@AllArgsConstructor
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    private final UserInfoMapper dao;

    @Override
    public IPage<UserInfo> queryList(Page<UserInfo> page, UserInfo userInfo) {
        return dao.query(page, userInfo);
    }

    @Override
    public String login(UserInfo userInfo) throws BaseException {
        if (StringUtils.isEmpty(userInfo.getUsername()) || StringUtils.isEmpty(userInfo.getPassword())) {
            throw new BaseException("用户名或密码错误");
        }
        UserInfo u = getOne(Wrappers.<UserInfo>lambdaQuery().eq(UserInfo::getUsername, userInfo.getUsername()));
        if (!u.getPassword().equals(userInfo.getPassword())) {
            throw new BaseException("用户名或密码错误");
        }
        String token = TokenUtil.createToken();
        TokenMap.setUser(token, u);
        return token;
    }

    @Override
    public void logout(String token) throws BaseException {
        TokenMap.deleteUser(token);
    }

}
