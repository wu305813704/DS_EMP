package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.UserInfo;
import com.sunyard.emp.service.UserInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 用户信息
 *
 * @author KouKi
 * @version 2021-02-04 15:37:42
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

//    /**
//    *  带查询条件和分页的列表
//    * @param params 参数
//    * @return 根据查询条件查出的用户信息分页列表
//    */
//    @PostMapping("/page")
//    @ApiOperation(value = "用户信息条件分页列表")
//    public CommonResponse page(@RequestBody Map<String, Object> params) {
//        PageAndWrapper<UserInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, UserInfo.class);
//        return new CommonResponse(userInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
//    }
//
//    /**
//      * 带查询条件的列表
//      * @param  userInfo 查询条件
//      * @return 根据查询条件查出的用户信息列表
//      */
//    @PostMapping("/list")
//    @ApiOperation(value = "用户信息条件查询列表")
//    public CommonResponse list(@RequestBody UserInfo userInfo) {
//        return new CommonResponse(userInfoService.list(new QueryWrapper<>(userInfo)));
//    }
//
//    /**
//     * 信息
//     * @param id 要查询的用户信息id
//     * @return CommonResponse 根据id查询的用户信息信息
//     */
//    @GetMapping("/{id}")
//    @ApiOperation(value = "用户信息根据id查询信息")
//    public CommonResponse info(@PathVariable("id") Long id) {
//        UserInfo userInfo = userInfoService.getById(id);
//        return new CommonResponse<>(userInfo);
//    }
//
//    /**
//     * 保存
//     * @param userInfo 需要新增的用户信息信息
//     * @return CommonResponse 是否新增成功
//     */
//    @PostMapping
//    @ApiOperation(value = "用户信息保存")
//    public CommonResponse save(@RequestBody UserInfo userInfo) {
//        return new CommonResponse<>(userInfoService.save(userInfo));
//    }
//
//    /**
//     * 修改
//     * @param userInfo 需要更新的用户信息信息
//     * @return CommonResponse 是否修改成功
//     */
//    @PutMapping
//    @ApiOperation(value = "用户信息修改")
//    public CommonResponse update(@RequestBody UserInfo userInfo) {
//        return new CommonResponse<>(userInfoService.updateById(userInfo));
//    }
//
//    /**
//     * 删除
//     * @param id 需要删除的用户信息id
//     * @return CommonResponse 是否删除成功
//     */
//    @DeleteMapping("/{id}")
//    @ApiOperation(value = "用户信息根据id删除")
//    public CommonResponse delete(@PathVariable Long id) {
//        return new CommonResponse<>(userInfoService.removeById(id));
//    }

    @PostMapping("/login")
    public CommonResponse login(@RequestBody UserInfo userInfo) {
        return new CommonResponse(userInfoService.login(userInfo));
    }

    @PostMapping("/logout")
    public CommonResponse logout(@RequestHeader("Authorization") String token) {
        userInfoService.logout(token);
        return new CommonResponse().success();
    }

}
