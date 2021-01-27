package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.OpCompanyInfo;
import com.sunyard.emp.service.OpCompanyInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 对外投资企业信息
 *
 * @author KouKi
 * @version  2021-01-21 16:48:14
 */
@Api(tags = "对外投资企业信息")
@RestController
@RequestMapping("/opCompanyInfo")
public class OpCompanyInfoController {

    @Autowired
    private OpCompanyInfoService opCompanyInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的对外投资企业信息分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "对外投资企业信息条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<OpCompanyInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, OpCompanyInfo.class);
        return new CommonResponse(opCompanyInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  opCompanyInfo 查询条件
      * @return 根据查询条件查出的对外投资企业信息列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "对外投资企业信息条件查询列表")
    public CommonResponse list(@RequestBody OpCompanyInfo opCompanyInfo) {
        return new CommonResponse(opCompanyInfoService.list(new QueryWrapper<>(opCompanyInfo)));
    }

    /**
     * 信息
     * @param id 要查询的对外投资企业信息id
     * @return CommonResponse 根据id查询的对外投资企业信息信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "对外投资企业信息根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        OpCompanyInfo opCompanyInfo = opCompanyInfoService.getById(id);
        return new CommonResponse<>(opCompanyInfo);
    }

    /**
     * 保存
     * @param opCompanyInfo 需要新增的对外投资企业信息信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "对外投资企业信息保存")
    public CommonResponse save(@RequestBody OpCompanyInfo opCompanyInfo) {
        return new CommonResponse<>(opCompanyInfoService.save(opCompanyInfo));
    }

    /**
     * 修改
     * @param opCompanyInfo 需要更新的对外投资企业信息信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "对外投资企业信息修改")
    public CommonResponse update(@RequestBody OpCompanyInfo opCompanyInfo) {
        return new CommonResponse<>(opCompanyInfoService.updateById(opCompanyInfo));
    }

    /**
     * 删除
     * @param id 需要删除的对外投资企业信息id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "对外投资企业信息根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(opCompanyInfoService.removeById(id));
    }

}
