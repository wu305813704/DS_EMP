package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyProfitInfo;
import com.sunyard.emp.service.CompanyProfitInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业利润
 *
 * @author KouKi
 * @version  2021-01-26 17:11:18
 */
@Api(tags = "企业利润")
@RestController
@RequestMapping("/companyProfitInfo")
public class CompanyProfitInfoController {

    @Autowired
    private CompanyProfitInfoService companyProfitInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业利润分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业利润条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyProfitInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyProfitInfo.class);
        return new CommonResponse(companyProfitInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyProfitInfo 查询条件
      * @return 根据查询条件查出的企业利润列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业利润条件查询列表")
    public CommonResponse list(@RequestBody CompanyProfitInfo companyProfitInfo) {
        return new CommonResponse(companyProfitInfoService.list(new QueryWrapper<>(companyProfitInfo)));
    }

    /**
     * 信息
     * @param id 要查询的企业利润id
     * @return CommonResponse 根据id查询的企业利润信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业利润根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyProfitInfo companyProfitInfo = companyProfitInfoService.getById(id);
        return new CommonResponse<>(companyProfitInfo);
    }

    /**
     * 保存
     * @param companyProfitInfo 需要新增的企业利润信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业利润保存")
    public CommonResponse save(@RequestBody CompanyProfitInfo companyProfitInfo) {
        return new CommonResponse<>(companyProfitInfoService.save(companyProfitInfo));
    }

    /**
     * 修改
     * @param companyProfitInfo 需要更新的企业利润信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业利润修改")
    public CommonResponse update(@RequestBody CompanyProfitInfo companyProfitInfo) {
        return new CommonResponse<>(companyProfitInfoService.updateById(companyProfitInfo));
    }

    /**
     * 删除
     * @param id 需要删除的企业利润id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业利润根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyProfitInfoService.removeById(id));
    }

}
