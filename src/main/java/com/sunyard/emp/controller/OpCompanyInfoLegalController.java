package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.OpCompanyInfoLegal;
import com.sunyard.emp.service.OpCompanyInfoLegalService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 法人对外投资企业信息
 *
 * @author KouKi
 * @version  2021-01-22 16:54:59
 */
@Api(tags = "法人对外投资企业信息")
@RestController
@RequestMapping("/opCompanyInfoLegal")
public class OpCompanyInfoLegalController {

    @Autowired
    private OpCompanyInfoLegalService opCompanyInfoLegalService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的法人对外投资企业信息分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "法人对外投资企业信息条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<OpCompanyInfoLegal> pageAndWrapper = PageAndWrapperUtil.getPage(params, OpCompanyInfoLegal.class);
        return new CommonResponse(opCompanyInfoLegalService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  opCompanyInfoLegal 查询条件
      * @return 根据查询条件查出的法人对外投资企业信息列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "法人对外投资企业信息条件查询列表")
    public CommonResponse list(@RequestBody OpCompanyInfoLegal opCompanyInfoLegal) {
        return new CommonResponse(opCompanyInfoLegalService.list(new QueryWrapper<>(opCompanyInfoLegal)));
    }

    /**
     * 信息
     * @param id 要查询的法人对外投资企业信息id
     * @return CommonResponse 根据id查询的法人对外投资企业信息信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "法人对外投资企业信息根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        OpCompanyInfoLegal opCompanyInfoLegal = opCompanyInfoLegalService.getById(id);
        return new CommonResponse<>(opCompanyInfoLegal);
    }

    /**
     * 保存
     * @param opCompanyInfoLegal 需要新增的法人对外投资企业信息信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "法人对外投资企业信息保存")
    public CommonResponse save(@RequestBody OpCompanyInfoLegal opCompanyInfoLegal) {
        return new CommonResponse<>(opCompanyInfoLegalService.save(opCompanyInfoLegal));
    }

    /**
     * 修改
     * @param opCompanyInfoLegal 需要更新的法人对外投资企业信息信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "法人对外投资企业信息修改")
    public CommonResponse update(@RequestBody OpCompanyInfoLegal opCompanyInfoLegal) {
        return new CommonResponse<>(opCompanyInfoLegalService.updateById(opCompanyInfoLegal));
    }

    /**
     * 删除
     * @param id 需要删除的法人对外投资企业信息id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "法人对外投资企业信息根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(opCompanyInfoLegalService.removeById(id));
    }

}
