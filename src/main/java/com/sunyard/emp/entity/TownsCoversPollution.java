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
 * 排污企业分布
 *
 * @author KouKi
 * @version 2021-02-01 13:06:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("towns_covers_pollution")
@ApiModel(description = "排污企业分布实体")
public class TownsCoversPollution extends Model<TownsCoversPollution> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 乡镇
     */
    @ApiModelProperty(value = "乡镇")
    private String towns;
    /**
     * 排污企业数
     */
    @ApiModelProperty(value = "排污企业数")
    private Integer companyCount;
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
