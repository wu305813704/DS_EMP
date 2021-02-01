package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.AreaCovers;
import com.sunyard.emp.service.AreaCoversService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 占地分析
 *
 * @author KouKi
 * @version  2021-02-01 12:59:26
 */
@Api(tags = "占地分析")
@RestController
@RequestMapping("/areaCovers")
public class AreaCoversController {

    @Autowired
    private AreaCoversService areaCoversService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的占地分析分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "占地分析条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<AreaCovers> pageAndWrapper = PageAndWrapperUtil.getPage(params, AreaCovers.class);
        return new CommonResponse(areaCoversService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  areaCovers 查询条件
      * @return 根据查询条件查出的占地分析列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "占地分析条件查询列表")
    public CommonResponse list(@RequestBody AreaCovers areaCovers) {
        return new CommonResponse(areaCoversService.list(new QueryWrapper<>(areaCovers)));
    }

    /**
     * 信息
     * @param id 要查询的占地分析id
     * @return CommonResponse 根据id查询的占地分析信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "占地分析根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        AreaCovers areaCovers = areaCoversService.getById(id);
        return new CommonResponse<>(areaCovers);
    }

    /**
     * 保存
     * @param areaCovers 需要新增的占地分析信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "占地分析保存")
    public CommonResponse save(@RequestBody AreaCovers areaCovers) {
        return new CommonResponse<>(areaCoversService.save(areaCovers));
    }

    /**
     * 修改
     * @param areaCovers 需要更新的占地分析信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "占地分析修改")
    public CommonResponse update(@RequestBody AreaCovers areaCovers) {
        return new CommonResponse<>(areaCoversService.updateById(areaCovers));
    }

    /**
     * 删除
     * @param id 需要删除的占地分析id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "占地分析根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(areaCoversService.removeById(id));
    }

}
