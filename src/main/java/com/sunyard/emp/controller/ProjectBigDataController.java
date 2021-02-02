package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.ProjectBigData;
import com.sunyard.emp.service.ProjectBigDataService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 项目大数据
 *
 * @author KouKi
 * @version  2021-02-02 15:18:16
 */
@Api(tags = "项目大数据")
@RestController
@RequestMapping("/projectBigData")
public class ProjectBigDataController {

    @Autowired
    private ProjectBigDataService projectBigDataService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的项目大数据分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "项目大数据条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<ProjectBigData> pageAndWrapper = PageAndWrapperUtil.getPage(params, ProjectBigData.class);
        return new CommonResponse(projectBigDataService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  projectBigData 查询条件
      * @return 根据查询条件查出的项目大数据列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "项目大数据条件查询列表")
    public CommonResponse list(@RequestBody ProjectBigData projectBigData) {
        return new CommonResponse(projectBigDataService.list(new QueryWrapper<>(projectBigData)));
    }

    /**
     * 信息
     * @param id 要查询的项目大数据id
     * @return CommonResponse 根据id查询的项目大数据信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "项目大数据根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        ProjectBigData projectBigData = projectBigDataService.getById(id);
        return new CommonResponse<>(projectBigData);
    }

    /**
     * 保存
     * @param projectBigData 需要新增的项目大数据信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "项目大数据保存")
    public CommonResponse save(@RequestBody ProjectBigData projectBigData) {
        return new CommonResponse<>(projectBigDataService.save(projectBigData));
    }

    /**
     * 修改
     * @param projectBigData 需要更新的项目大数据信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "项目大数据修改")
    public CommonResponse update(@RequestBody ProjectBigData projectBigData) {
        return new CommonResponse<>(projectBigDataService.updateById(projectBigData));
    }

    /**
     * 删除
     * @param id 需要删除的项目大数据id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "项目大数据根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(projectBigDataService.removeById(id));
    }

}
