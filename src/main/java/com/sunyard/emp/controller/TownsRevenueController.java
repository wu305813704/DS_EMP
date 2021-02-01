package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.TownsRevenue;
import com.sunyard.emp.service.TownsRevenueService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 乡镇亩均税收
 *
 * @author KouKi
 * @version  2021-02-01 12:21:19
 */
@Api(tags = "乡镇亩均税收")
@RestController
@RequestMapping("/townsRevenue")
public class TownsRevenueController {

    @Autowired
    private TownsRevenueService townsRevenueService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的乡镇亩均税收分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "乡镇亩均税收条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<TownsRevenue> pageAndWrapper = PageAndWrapperUtil.getPage(params, TownsRevenue.class);
        return new CommonResponse(townsRevenueService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  townsRevenue 查询条件
      * @return 根据查询条件查出的乡镇亩均税收列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "乡镇亩均税收条件查询列表")
    public CommonResponse list(@RequestBody TownsRevenue townsRevenue) {
        return new CommonResponse(townsRevenueService.list(new QueryWrapper<>(townsRevenue)));
    }

    /**
     * 信息
     * @param id 要查询的乡镇亩均税收id
     * @return CommonResponse 根据id查询的乡镇亩均税收信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "乡镇亩均税收根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        TownsRevenue townsRevenue = townsRevenueService.getById(id);
        return new CommonResponse<>(townsRevenue);
    }

    /**
     * 保存
     * @param townsRevenue 需要新增的乡镇亩均税收信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "乡镇亩均税收保存")
    public CommonResponse save(@RequestBody TownsRevenue townsRevenue) {
        return new CommonResponse<>(townsRevenueService.save(townsRevenue));
    }

    /**
     * 修改
     * @param townsRevenue 需要更新的乡镇亩均税收信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "乡镇亩均税收修改")
    public CommonResponse update(@RequestBody TownsRevenue townsRevenue) {
        return new CommonResponse<>(townsRevenueService.updateById(townsRevenue));
    }

    /**
     * 删除
     * @param id 需要删除的乡镇亩均税收id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "乡镇亩均税收根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(townsRevenueService.removeById(id));
    }

}
