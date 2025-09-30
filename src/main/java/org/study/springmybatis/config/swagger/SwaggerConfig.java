package org.study.springmybatis.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("게시판 토이프로젝트 API")
                        .description("mybatis 및 swagger 연습을 위한 게시판 토이프로젝트 API")
                        .version("v1.0.0"))
                .servers(List.of(new Server()
                        .url("http://localhost:8080")
                        .description("개발용 서버")
                ));
    }
}
