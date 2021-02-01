package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.ProjectStatisticsDetail;
import com.sunyard.emp.service.ProjectStatisticsDetailService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 项目统计详情
 *
 * @author KouKi
 * @version  2021-02-01 18:47:04
 */
@Api(tags = "项目统计详情")
@RestController
@RequestMapping("/projectStatisticsDetail")
public class ProjectStatisticsDetailController {

    @Autowired
    private ProjectStatisticsDetailService projectStatisticsDetailService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的项目统计详情分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "项目统计详情条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<ProjectStatisticsDetail> pageAndWrapper = PageAndWrapperUtil.getPage(params, ProjectStatisticsDetail.class);
        return new CommonResponse(projectStatisticsDetailService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  projectStatisticsDetail 查询条件
      * @return 根据查询条件查出的项目统计详情列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "项目统计详情条件查询列表")
    public CommonResponse list(@RequestBody ProjectStatisticsDetail projectStatisticsDetail) {
        return new CommonResponse(projectStatisticsDetailService.list(new QueryWrapper<>(projectStatisticsDetail)));
    }

    /**
     * 信息
     * @param id 要查询的项目统计详情id
     * @return CommonResponse 根据id查询的项目统计详情信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "项目统计详情根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        ProjectStatisticsDetail projectStatisticsDetail = projectStatisticsDetailService.getById(id);
        return new CommonResponse<>(projectStatisticsDetail);
    }

    /**
     * 保存
     * @param projectStatisticsDetail 需要新增的项目统计详情信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "项目统计详情保存")
    public CommonResponse save(@RequestBody ProjectStatisticsDetail projectStatisticsDetail) {
        return new CommonResponse<>(projectStatisticsDetailService.save(projectStatisticsDetail));
    }

    /**
     * 修改
     * @param projectStatisticsDetail 需要更新的项目统计详情信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "项目统计详情修改")
    public CommonResponse update(@RequestBody ProjectStatisticsDetail projectStatisticsDetail) {
        return new CommonResponse<>(projectStatisticsDetailService.updateById(projectStatisticsDetail));
    }

    /**
     * 删除
     * @param id 需要删除的项目统计详情id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "项目统计详情根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(projectStatisticsDetailService.removeById(id));
    }

}
