package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.ProjectStatistics;
import com.sunyard.emp.service.ProjectStatisticsService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 项目统计
 *
 * @author KouKi
 * @version  2021-02-01 18:40:49
 */
@Api(tags = "项目统计")
@RestController
@RequestMapping("/projectStatistics")
public class ProjectStatisticsController {

    @Autowired
    private ProjectStatisticsService projectStatisticsService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的项目统计分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "项目统计条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<ProjectStatistics> pageAndWrapper = PageAndWrapperUtil.getPage(params, ProjectStatistics.class);
        return new CommonResponse(projectStatisticsService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  projectStatistics 查询条件
      * @return 根据查询条件查出的项目统计列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "项目统计条件查询列表")
    public CommonResponse list(@RequestBody ProjectStatistics projectStatistics) {
        return new CommonResponse(projectStatisticsService.list(new QueryWrapper<>(projectStatistics)));
    }

    /**
     * 信息
     * @param id 要查询的项目统计id
     * @return CommonResponse 根据id查询的项目统计信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "项目统计根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        ProjectStatistics projectStatistics = projectStatisticsService.getById(id);
        return new CommonResponse<>(projectStatistics);
    }

    /**
     * 保存
     * @param projectStatistics 需要新增的项目统计信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "项目统计保存")
    public CommonResponse save(@RequestBody ProjectStatistics projectStatistics) {
        return new CommonResponse<>(projectStatisticsService.save(projectStatistics));
    }

    /**
     * 修改
     * @param projectStatistics 需要更新的项目统计信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "项目统计修改")
    public CommonResponse update(@RequestBody ProjectStatistics projectStatistics) {
        return new CommonResponse<>(projectStatisticsService.updateById(projectStatistics));
    }

    /**
     * 删除
     * @param id 需要删除的项目统计id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "项目统计根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(projectStatisticsService.removeById(id));
    }

}
