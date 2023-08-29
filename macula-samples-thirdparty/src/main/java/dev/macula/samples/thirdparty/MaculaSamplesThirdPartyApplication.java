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

package dev.macula.samples.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code MaculaSamplesThirdPartyApplication} 第三方调用启动类
 *
 * @author rain
 * @since 2023/8/28 22:39
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MaculaSamplesThirdPartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaculaSamplesThirdPartyApplication.class, args);
    }
}
