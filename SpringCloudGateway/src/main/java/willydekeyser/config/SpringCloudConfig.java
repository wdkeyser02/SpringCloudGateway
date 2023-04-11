package willydekeyser.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//@Configuration
public class SpringCloudConfig {

	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("firtsModule", r -> r
                		.path("/first/**")
                        .uri("http://localhost:8081/"))

                .route("secondModule", r -> r
                		.path("/second/**")
                        .uri("http://localhost:8082/"))
                .build();
    }
}
