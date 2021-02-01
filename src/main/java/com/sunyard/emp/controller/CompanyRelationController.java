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
 * 关系网络
 *
 * @author KouKi
 * @version  2021-02-01 12:04:21
 */
@Api(tags = "关系网络")
@RestController
@RequestMapping("/companyRelation")
public class CompanyRelationController {

    @Autowired
    private CompanyRelationService companyRelationService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的关系网络分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "关系网络条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyRelation> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyRelation.class);
        return new CommonResponse(companyRelationService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyRelation 查询条件
      * @return 根据查询条件查出的关系网络列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "关系网络条件查询列表")
    public CommonResponse list(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse(companyRelationService.list(new QueryWrapper<>(companyRelation)));
    }

    /**
     * 信息
     * @param id 要查询的关系网络id
     * @return CommonResponse 根据id查询的关系网络信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "关系网络根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyRelation companyRelation = companyRelationService.getById(id);
        return new CommonResponse<>(companyRelation);
    }

    /**
     * 保存
     * @param companyRelation 需要新增的关系网络信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "关系网络保存")
    public CommonResponse save(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse<>(companyRelationService.save(companyRelation));
    }

    /**
     * 修改
     * @param companyRelation 需要更新的关系网络信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "关系网络修改")
    public CommonResponse update(@RequestBody CompanyRelation companyRelation) {
        return new CommonResponse<>(companyRelationService.updateById(companyRelation));
    }

    /**
     * 删除
     * @param id 需要删除的关系网络id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "关系网络根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyRelationService.removeById(id));
    }

}
