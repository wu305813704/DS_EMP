package com.sunyard.emp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 企业大数据
 *
 * @author KouKi
 * @version 2021-02-01 12:54:11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("company_big_data")
@ApiModel(description = "企业大数据实体")
public class CompanyBigData extends Model<CompanyBigData> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 企业总数
     */
    @ApiModelProperty(value = "企业总数")
    private Integer companyTotal;
    /**
     * 销售总额
     */
    @ApiModelProperty(value = "销售总额")
    private Integer profitTotal;
    /**
     * 排污总量
     */
    @ApiModelProperty(value = "排污总量")
    private Integer pollutionTotal;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer companyTotalGs;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer revenueTotal;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer exhaustTotal;
    /**
     * 占地面积
     */
    @ApiModelProperty(value = "占地面积")
    private Integer area;
    /**
     * 亩均收入
     */
    @ApiModelProperty(value = "亩均收入")
    private Integer revenueMu;
    /**
     * 废水排放
     */
    @ApiModelProperty(value = "废水排放")
    private Integer effluentTotal;
    /**
     * 规上用地比例
     */
    @ApiModelProperty(value = "规上用地比例")
    private String proportionGs;
    /**
     * 亩均销售
     */
    @ApiModelProperty(value = "亩均销售")
    private Integer profitMu;
    /**
     * 总能耗
     */
    @ApiModelProperty(value = "总能耗")
    private Integer energyTotal;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private LocalDateTime createTime;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private LocalDateTime updateTime;

    /**
     * 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
