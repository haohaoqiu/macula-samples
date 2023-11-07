/*
 * Copyright (c) 2023 Macula
 *   macula.dev, China
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.macula.samples.service2.api;

import dev.macula.boot.result.PageVO;
import dev.macula.samples.service2.api.fallback.AbstracApplicationFeignFallbackFactory;
import dev.macula.samples.service2.form.ApplicationForm;
import dev.macula.samples.service2.query.ApplicationPageQuery;
import dev.macula.samples.service2.vo.ApplicationVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * {@code ApplicationFeignClient} 应用远程接口
 *
 * @author rain
 * @since 2023/9/11 17:38
 */
@FeignClient(value = "macula-samples-service1", contextId = "applicationFeignClient",
    fallbackFactory = AbstracApplicationFeignFallbackFactory.class)
public interface ApplicationFeignClient {
    @GetMapping("/api/v1/app")
    PageVO<ApplicationVO> listApplications(@SpringQueryMap ApplicationPageQuery queryParams);

    @PostMapping("/api/v1/app")
    boolean saveApplication(@Valid @RequestBody ApplicationForm formData);

    @PutMapping(value = "/api/v1/app/{appId}")
    boolean updateApplication(@PathVariable Long appId, @Valid @RequestBody ApplicationForm formData);

    @DeleteMapping("/api/v1/app/{ids}")
    boolean deleteApplications(@PathVariable("ids") String ids);

    @PutMapping("/api/v1/app/addMaintainer/{appId}")
    boolean addMaintainer(@PathVariable Long appId, @RequestBody ApplicationForm formData);
}
