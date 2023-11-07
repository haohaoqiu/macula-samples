package dev.macula.samples.service2.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import dev.macula.boot.starter.mp.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("kms")
public class Kms  extends BaseEntity {
    /**
     * 应用id，密钥所属应用
     */
    private Long appId;

    @Schema(
            description = "密钥名称"
    )
    /**
     * 密钥名称
     */
    private String keyName;

    @Schema(
            description = "密钥公钥"
    )
    @TableField(fill = FieldFill.INSERT, updateStrategy = FieldStrategy.NEVER)
    private String publicKey;

    @Schema(
            description = "密钥私钥"
    )
    @TableField(fill = FieldFill.INSERT, updateStrategy = FieldStrategy.NEVER)
    private String privateKey;
}
