package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyRelation;
import com.sunyard.emp.service.CompanyRelationService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业关系
 *
 * @author KouKi
 * @version  2021-01-26 16:51:12
 */
@Api(tags = "企业关系")
@RestController
@RequestMapping("/companyRelation")
public class CompanyRelationController {

    @Autowired
    private CompanyRelationService companyRelationService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业关系分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业关系条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyRelation> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyRelation.class);
        return new CommonResponse(companyRelationService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyRelation 查询条件
      * @return 根据查询条件查出的企业关系列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业关系条件查询列表")
    public CommonResponse list(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse(companyRelationService.list(new QueryWrapper<>(companyRelation)));
    }

    /**
     * 信息
     * @param id 要查询的企业关系id
     * @return CommonResponse 根据id查询的企业关系信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业关系根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyRelation companyRelation = companyRelationService.getById(id);
        return new CommonResponse<>(companyRelation);
    }

    /**
     * 保存
     * @param companyRelation 需要新增的企业关系信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业关系保存")
    public CommonResponse save(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse<>(companyRelationService.save(companyRelation));
    }

    /**
     * 修改
     * @param companyRelation 需要更新的企业关系信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业关系修改")
    public CommonResponse update(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse<>(companyRelationService.updateById(companyRelation));
    }

    /**
     * 删除
     * @param id 需要删除的企业关系id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业关系根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyRelationService.removeById(id));
    }

}
