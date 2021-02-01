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
 * 关系网络
 *
 * @author KouKi
 * @version 2021-02-01 12:04:21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("company_relation")
@ApiModel(description = "关系网络实体")
public class CompanyRelation extends Model<CompanyRelation> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 企业注册号
     */
    @ApiModelProperty(value = "企业注册号")
    private String regNo;
    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;
    /**
     * x轴偏移(关系网络)
     */
    @ApiModelProperty(value = "x轴偏移(关系网络)")
    private String x;
    /**
     * x轴偏移(关系网络)
     */
    @ApiModelProperty(value = "x轴偏移(关系网络)")
    private String y;
    /**
     * 目标id
     */
    @ApiModelProperty(value = "目标id")
    private String targetId;
    /**
     * 球体颜色
     */
    @ApiModelProperty(value = "球体颜色")
    private String color;
    /**
     * 线颜色
     */
    @ApiModelProperty(value = "线颜色")
    private String colorLine;
    /**
     * 关联人姓名
     */
    @ApiModelProperty(value = "关联人姓名")
    private String name;
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
