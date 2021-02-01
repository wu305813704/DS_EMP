package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.TownsCovers;
import com.sunyard.emp.service.TownsCoversService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 区域分析
 *
 * @author KouKi
 * @version  2021-02-01 13:03:06
 */
@Api(tags = "区域分析")
@RestController
@RequestMapping("/townsCovers")
public class TownsCoversController {

    @Autowired
    private TownsCoversService townsCoversService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的区域分析分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "区域分析条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<TownsCovers> pageAndWrapper = PageAndWrapperUtil.getPage(params, TownsCovers.class);
        return new CommonResponse(townsCoversService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  townsCovers 查询条件
      * @return 根据查询条件查出的区域分析列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "区域分析条件查询列表")
    public CommonResponse list(@RequestBody TownsCovers townsCovers) {
        return new CommonResponse(townsCoversService.list(new QueryWrapper<>(townsCovers)));
    }

    /**
     * 信息
     * @param id 要查询的区域分析id
     * @return CommonResponse 根据id查询的区域分析信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "区域分析根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        TownsCovers townsCovers = townsCoversService.getById(id);
        return new CommonResponse<>(townsCovers);
    }

    /**
     * 保存
     * @param townsCovers 需要新增的区域分析信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "区域分析保存")
    public CommonResponse save(@RequestBody TownsCovers townsCovers) {
        return new CommonResponse<>(townsCoversService.save(townsCovers));
    }

    /**
     * 修改
     * @param townsCovers 需要更新的区域分析信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "区域分析修改")
    public CommonResponse update(@RequestBody TownsCovers townsCovers) {
        return new CommonResponse<>(townsCoversService.updateById(townsCovers));
    }

    /**
     * 删除
     * @param id 需要删除的区域分析id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "区域分析根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(townsCoversService.removeById(id));
    }

}
