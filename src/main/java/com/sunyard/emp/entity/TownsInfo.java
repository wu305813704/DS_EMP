package com.sunyard.emp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 乡镇信息
 *
 * @author KouKi
 * @version 2021-01-27 16:21:55
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("towns_info")
@ApiModel(description = "乡镇信息实体")
public class TownsInfo extends Model<TownsInfo> {
    private static final long serialVersionUID = 1L;

    /**
     * 面积(亩)
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "面积(亩)")
    private Long id;
    /**
     * 乡镇名称
     */
    @ApiModelProperty(value = "乡镇名称")
    private String name;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private BigDecimal mu;
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
