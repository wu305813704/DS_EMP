package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.TownsCoversPollution;
import com.sunyard.emp.service.TownsCoversPollutionService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 排污企业分布
 *
 * @author KouKi
 * @version  2021-02-01 13:06:54
 */
@Api(tags = "排污企业分布")
@RestController
@RequestMapping("/townsCoversPollution")
public class TownsCoversPollutionController {

    @Autowired
    private TownsCoversPollutionService townsCoversPollutionService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的排污企业分布分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "排污企业分布条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<TownsCoversPollution> pageAndWrapper = PageAndWrapperUtil.getPage(params, TownsCoversPollution.class);
        return new CommonResponse(townsCoversPollutionService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  townsCoversPollution 查询条件
      * @return 根据查询条件查出的排污企业分布列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "排污企业分布条件查询列表")
    public CommonResponse list(@RequestBody TownsCoversPollution townsCoversPollution) {
        return new CommonResponse(townsCoversPollutionService.list(new QueryWrapper<>(townsCoversPollution)));
    }

    /**
     * 信息
     * @param id 要查询的排污企业分布id
     * @return CommonResponse 根据id查询的排污企业分布信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "排污企业分布根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        TownsCoversPollution townsCoversPollution = townsCoversPollutionService.getById(id);
        return new CommonResponse<>(townsCoversPollution);
    }

    /**
     * 保存
     * @param townsCoversPollution 需要新增的排污企业分布信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "排污企业分布保存")
    public CommonResponse save(@RequestBody TownsCoversPollution townsCoversPollution) {
        return new CommonResponse<>(townsCoversPollutionService.save(townsCoversPollution));
    }

    /**
     * 修改
     * @param townsCoversPollution 需要更新的排污企业分布信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "排污企业分布修改")
    public CommonResponse update(@RequestBody TownsCoversPollution townsCoversPollution) {
        return new CommonResponse<>(townsCoversPollutionService.updateById(townsCoversPollution));
    }

    /**
     * 删除
     * @param id 需要删除的排污企业分布id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "排污企业分布根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(townsCoversPollutionService.removeById(id));
    }

}
