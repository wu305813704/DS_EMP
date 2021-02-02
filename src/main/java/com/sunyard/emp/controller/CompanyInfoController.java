package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyInfo;
import com.sunyard.emp.service.CompanyInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业基本信息
 *
 * @author KouKi
 * @version  2021-02-02 11:23:05
 */
@Api(tags = "企业基本信息")
@RestController
@RequestMapping("/companyInfo")
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业基本信息分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业基本信息条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyInfo.class);
        return new CommonResponse(companyInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyInfo 查询条件
      * @return 根据查询条件查出的企业基本信息列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业基本信息条件查询列表")
    public CommonResponse list(@RequestBody CompanyInfo companyInfo) {
        return new CommonResponse(companyInfoService.list(new QueryWrapper<>(companyInfo)));
    }

    /**
     * 信息
     * @param id 要查询的企业基本信息id
     * @return CommonResponse 根据id查询的企业基本信息信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业基本信息根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyInfo companyInfo = companyInfoService.getById(id);
        return new CommonResponse<>(companyInfo);
    }

    /**
     * 保存
     * @param companyInfo 需要新增的企业基本信息信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业基本信息保存")
    public CommonResponse save(@RequestBody CompanyInfo companyInfo) {
        return new CommonResponse<>(companyInfoService.save(companyInfo));
    }

    /**
     * 修改
     * @param companyInfo 需要更新的企业基本信息信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业基本信息修改")
    public CommonResponse update(@RequestBody CompanyInfo companyInfo) {
        return new CommonResponse<>(companyInfoService.updateById(companyInfo));
    }

    /**
     * 删除
     * @param id 需要删除的企业基本信息id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业基本信息根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyInfoService.removeById(id));
    }

}
