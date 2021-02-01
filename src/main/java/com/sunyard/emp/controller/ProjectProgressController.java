package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.ProjectProgress;
import com.sunyard.emp.service.ProjectProgressService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 项目进度详情
 *
 * @author KouKi
 * @version  2021-02-01 18:51:33
 */
@Api(tags = "项目进度详情")
@RestController
@RequestMapping("/projectProgress")
public class ProjectProgressController {

    @Autowired
    private ProjectProgressService projectProgressService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的项目进度详情分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "项目进度详情条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<ProjectProgress> pageAndWrapper = PageAndWrapperUtil.getPage(params, ProjectProgress.class);
        return new CommonResponse(projectProgressService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  projectProgress 查询条件
      * @return 根据查询条件查出的项目进度详情列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "项目进度详情条件查询列表")
    public CommonResponse list(@RequestBody ProjectProgress projectProgress) {
        return new CommonResponse(projectProgressService.list(new QueryWrapper<>(projectProgress)));
    }

    /**
     * 信息
     * @param id 要查询的项目进度详情id
     * @return CommonResponse 根据id查询的项目进度详情信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "项目进度详情根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        ProjectProgress projectProgress = projectProgressService.getById(id);
        return new CommonResponse<>(projectProgress);
    }

    /**
     * 保存
     * @param projectProgress 需要新增的项目进度详情信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "项目进度详情保存")
    public CommonResponse save(@RequestBody ProjectProgress projectProgress) {
        return new CommonResponse<>(projectProgressService.save(projectProgress));
    }

    /**
     * 修改
     * @param projectProgress 需要更新的项目进度详情信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "项目进度详情修改")
    public CommonResponse update(@RequestBody ProjectProgress projectProgress) {
        return new CommonResponse<>(projectProgressService.updateById(projectProgress));
    }

    /**
     * 删除
     * @param id 需要删除的项目进度详情id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "项目进度详情根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(projectProgressService.removeById(id));
    }

}
