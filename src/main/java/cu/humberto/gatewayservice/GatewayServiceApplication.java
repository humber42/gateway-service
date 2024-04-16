package cu.humberto.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

//    @Bean
//    RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//        String ms ="";
//        return builder.routes()
//                .route("waste-manager",r-> r.path("/")
//                        .uri("http://localhost:8081/"))
//                .route("waste-manager-address",r->r.path("/")
//                        .uri("http://localhost:8082/"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
