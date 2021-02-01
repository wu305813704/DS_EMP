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
 * 企业风险信息
 *
 * @author KouKi
 * @version 2021-01-31 13:53:15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("risk_info")
@ApiModel(description = "企业风险信息实体")
public class RiskInfo extends Model<RiskInfo> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 注册号
     */
    @ApiModelProperty(value = "注册号")
    private String regNo;
    /**
     * 行政处罚历史
     */
    @ApiModelProperty(value = "行政处罚历史")
    private Integer punishmentHistory;
    /**
     * 财产风险
     */
    @ApiModelProperty(value = "财产风险")
    private Integer propertyRisk;
    /**
     * 股权风险
     */
    @ApiModelProperty(value = "股权风险")
    private Integer equityRisk;
    /**
     * 经营异常
     */
    @ApiModelProperty(value = "经营异常")
    private Integer abnormalOperation;
    /**
     * 变更信息
     */
    @ApiModelProperty(value = "变更信息")
    private Integer changeInformation;
    /**
     * 失信被执行人
     */
    @ApiModelProperty(value = "失信被执行人")
    private Integer brokenPromise;
    /**
     * 被执行人信息
     */
    @ApiModelProperty(value = "被执行人信息")
    private Integer brokenPromiseInfo;
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
