package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.ProjectInvestProportion;
import com.sunyard.emp.service.ProjectInvestProportionService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 投资来源占比
 *
 * @author KouKi
 * @version  2021-02-01 18:56:10
 */
@Api(tags = "投资来源占比")
@RestController
@RequestMapping("/projectInvestProportion")
public class ProjectInvestProportionController {

    @Autowired
    private ProjectInvestProportionService projectInvestProportionService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的投资来源占比分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "投资来源占比条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<ProjectInvestProportion> pageAndWrapper = PageAndWrapperUtil.getPage(params, ProjectInvestProportion.class);
        return new CommonResponse(projectInvestProportionService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  projectInvestProportion 查询条件
      * @return 根据查询条件查出的投资来源占比列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "投资来源占比条件查询列表")
    public CommonResponse list(@RequestBody ProjectInvestProportion projectInvestProportion) {
        return new CommonResponse(projectInvestProportionService.list(new QueryWrapper<>(projectInvestProportion)));
    }

    /**
     * 信息
     * @param id 要查询的投资来源占比id
     * @return CommonResponse 根据id查询的投资来源占比信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "投资来源占比根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        ProjectInvestProportion projectInvestProportion = projectInvestProportionService.getById(id);
        return new CommonResponse<>(projectInvestProportion);
    }

    /**
     * 保存
     * @param projectInvestProportion 需要新增的投资来源占比信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "投资来源占比保存")
    public CommonResponse save(@RequestBody ProjectInvestProportion projectInvestProportion) {
        return new CommonResponse<>(projectInvestProportionService.save(projectInvestProportion));
    }

    /**
     * 修改
     * @param projectInvestProportion 需要更新的投资来源占比信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "投资来源占比修改")
    public CommonResponse update(@RequestBody ProjectInvestProportion projectInvestProportion) {
        return new CommonResponse<>(projectInvestProportionService.updateById(projectInvestProportion));
    }

    /**
     * 删除
     * @param id 需要删除的投资来源占比id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "投资来源占比根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(projectInvestProportionService.removeById(id));
    }

}
