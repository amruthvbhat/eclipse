package com.capgemini.cloudgatewayserver.configserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
public class DocumentationController implements SwaggerResourcesProvider {
	@Override
    public List get() {
        List<Object> resources = new ArrayList<>();
        resources.add(swaggerResource("Cart-service1", "Cart-service1/cart/v2/api-docs", "2.0"));
        resources.add(swaggerResource("Product-service1", "product/v2/api-docs", "2.0"));
        return resources;
    }
 
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }


}
