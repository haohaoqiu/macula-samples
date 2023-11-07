package dev.macula.samples.service2.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 应用分页视图对象
 */
@Schema(description = "应用分页视图对象")
@Data
public class ApplicationVO {
    @Schema(description = "应用ID")
    private Long id;

    @Schema(description = "应用名")
    private String applicationName;

    private String sk;

    @Schema(description = "主页")
    private String homepage;

    @Schema(description = "负责人")
    private String manager;

    @Schema(description = "维护人")
    private String maintainer;

    @Schema(description = "联系方式")
    private String mobile;

    @Schema(description = "应用编码")
    private String code;

    @Schema(description = "可访问url")
    private String accessPath;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH24:mm:ss")
    private LocalDateTime createTime;

    @Schema(description = "是否回传属性")
    private boolean useAttrs;

    @Schema(description = "回传属性列表")
    private String allowedAttrs;
}
