package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyBigData;
import com.sunyard.emp.service.CompanyBigDataService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业大数据
 *
 * @author KouKi
 * @version  2021-02-01 12:54:11
 */
@Api(tags = "企业大数据")
@RestController
@RequestMapping("/companyBigData")
public class CompanyBigDataController {

    @Autowired
    private CompanyBigDataService companyBigDataService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业大数据分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业大数据条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyBigData> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyBigData.class);
        return new CommonResponse(companyBigDataService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyBigData 查询条件
      * @return 根据查询条件查出的企业大数据列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业大数据条件查询列表")
    public CommonResponse list(@RequestBody CompanyBigData companyBigData) {
        return new CommonResponse(companyBigDataService.list(new QueryWrapper<>(companyBigData)));
    }

    /**
     * 信息
     * @param id 要查询的企业大数据id
     * @return CommonResponse 根据id查询的企业大数据信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业大数据根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyBigData companyBigData = companyBigDataService.getById(id);
        return new CommonResponse<>(companyBigData);
    }

    /**
     * 保存
     * @param companyBigData 需要新增的企业大数据信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业大数据保存")
    public CommonResponse save(@RequestBody CompanyBigData companyBigData) {
        return new CommonResponse<>(companyBigDataService.save(companyBigData));
    }

    /**
     * 修改
     * @param companyBigData 需要更新的企业大数据信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业大数据修改")
    public CommonResponse update(@RequestBody CompanyBigData companyBigData) {
        return new CommonResponse<>(companyBigDataService.updateById(companyBigData));
    }

    /**
     * 删除
     * @param id 需要删除的企业大数据id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业大数据根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyBigDataService.removeById(id));
    }

}
