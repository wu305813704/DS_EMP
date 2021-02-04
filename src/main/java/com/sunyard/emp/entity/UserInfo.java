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
 * 用户信息
 *
 * @author KouKi
 * @version 2021-02-04 15:37:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("user_info")
@ApiModel(description = "用户信息实体")
public class UserInfo extends Model<UserInfo> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String nickname;
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
