package dev.macula.samples.service2.query;

import dev.macula.boot.base.BasePageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用分页查询实体
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationPageQuery extends BasePageQuery {
    @Schema(description = "关键字(应用名称/应用编码)")
    private String keywords;
}
