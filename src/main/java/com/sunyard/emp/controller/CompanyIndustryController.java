package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyIndustry;
import com.sunyard.emp.service.CompanyIndustryService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业行业分布
 *
 * @author KouKi
 * @version  2021-02-01 12:27:01
 */
@Api(tags = "企业行业分布")
@RestController
@RequestMapping("/companyIndustry")
public class CompanyIndustryController {

    @Autowired
    private CompanyIndustryService companyIndustryService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业行业分布分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业行业分布条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyIndustry> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyIndustry.class);
        return new CommonResponse(companyIndustryService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyIndustry 查询条件
      * @return 根据查询条件查出的企业行业分布列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业行业分布条件查询列表")
    public CommonResponse list(@RequestBody CompanyIndustry companyIndustry) {
        return new CommonResponse(companyIndustryService.list(new QueryWrapper<>(companyIndustry)));
    }

    /**
     * 信息
     * @param id 要查询的企业行业分布id
     * @return CommonResponse 根据id查询的企业行业分布信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业行业分布根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyIndustry companyIndustry = companyIndustryService.getById(id);
        return new CommonResponse<>(companyIndustry);
    }

    /**
     * 保存
     * @param companyIndustry 需要新增的企业行业分布信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业行业分布保存")
    public CommonResponse save(@RequestBody CompanyIndustry companyIndustry) {
        return new CommonResponse<>(companyIndustryService.save(companyIndustry));
    }

    /**
     * 修改
     * @param companyIndustry 需要更新的企业行业分布信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业行业分布修改")
    public CommonResponse update(@RequestBody CompanyIndustry companyIndustry) {
        return new CommonResponse<>(companyIndustryService.updateById(companyIndustry));
    }

    /**
     * 删除
     * @param id 需要删除的企业行业分布id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业行业分布根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyIndustryService.removeById(id));
    }

}
