package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.RiskInfo;
import com.sunyard.emp.service.RiskInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业风险信息
 *
 * @author KouKi
 * @version  2021-01-31 13:53:15
 */
@Api(tags = "企业风险信息")
@RestController
@RequestMapping("/riskInfo")
public class RiskInfoController {

    @Autowired
    private RiskInfoService riskInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业风险信息分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业风险信息条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<RiskInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, RiskInfo.class);
        return new CommonResponse(riskInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  riskInfo 查询条件
      * @return 根据查询条件查出的企业风险信息列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业风险信息条件查询列表")
    public CommonResponse list(@RequestBody RiskInfo riskInfo) {
        return new CommonResponse(riskInfoService.list(new QueryWrapper<>(riskInfo)));
    }

    /**
     * 信息
     * @param id 要查询的企业风险信息id
     * @return CommonResponse 根据id查询的企业风险信息信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业风险信息根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        RiskInfo riskInfo = riskInfoService.getById(id);
        return new CommonResponse<>(riskInfo);
    }

    /**
     * 保存
     * @param riskInfo 需要新增的企业风险信息信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业风险信息保存")
    public CommonResponse save(@RequestBody RiskInfo riskInfo) {
        return new CommonResponse<>(riskInfoService.save(riskInfo));
    }

    /**
     * 修改
     * @param riskInfo 需要更新的企业风险信息信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业风险信息修改")
    public CommonResponse update(@RequestBody RiskInfo riskInfo) {
        return new CommonResponse<>(riskInfoService.updateById(riskInfo));
    }

    /**
     * 删除
     * @param id 需要删除的企业风险信息id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业风险信息根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(riskInfoService.removeById(id));
    }

}
