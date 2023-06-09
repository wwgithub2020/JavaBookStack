package cn.itcoder.model.vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @CreateTime: 2023-06-01  15:27
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class UserReqVO {
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
