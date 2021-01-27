package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanySellInfo;
import com.sunyard.emp.service.CompanySellInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业销售表
 *
 * @author KouKi
 * @version  2021-01-26 16:15:45
 */
@Api(tags = "企业销售表")
@RestController
@RequestMapping("/companySellInfo")
public class CompanySellInfoController {

    @Autowired
    private CompanySellInfoService companySellInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业销售表分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业销售表条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanySellInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanySellInfo.class);
        return new CommonResponse(companySellInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companySellInfo 查询条件
      * @return 根据查询条件查出的企业销售表列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业销售表条件查询列表")
    public CommonResponse list(@RequestBody CompanySellInfo companySellInfo) {
        return new CommonResponse(companySellInfoService.list(new QueryWrapper<>(companySellInfo)));
    }

    /**
     * 信息
     * @param id 要查询的企业销售表id
     * @return CommonResponse 根据id查询的企业销售表信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业销售表根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanySellInfo companySellInfo = companySellInfoService.getById(id);
        return new CommonResponse<>(companySellInfo);
    }

    /**
     * 保存
     * @param companySellInfo 需要新增的企业销售表信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业销售表保存")
    public CommonResponse save(@RequestBody CompanySellInfo companySellInfo) {
        return new CommonResponse<>(companySellInfoService.save(companySellInfo));
    }

    /**
     * 修改
     * @param companySellInfo 需要更新的企业销售表信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业销售表修改")
    public CommonResponse update(@RequestBody CompanySellInfo companySellInfo) {
        return new CommonResponse<>(companySellInfoService.updateById(companySellInfo));
    }

    /**
     * 删除
     * @param id 需要删除的企业销售表id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业销售表根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companySellInfoService.removeById(id));
    }

}
