package cn.itcoder.model.datasource;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @CreateTime: 2023-05-31  15:50
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@TableName(value = "user")
public class UserDO {
    private Long id;

    private String name;

    private Integer age;

    private String email;

    @TableLogic
    private Integer isDeleted;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createdBy;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updatedBy;

    @Version
    private Integer version;
}
