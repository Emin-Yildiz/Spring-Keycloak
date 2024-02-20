package com.example.keycloack.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter")
public class KeycloakJwt {
    private String resourceId;
    private String principalAttribute;

    public KeycloakJwt(){}

    public KeycloakJwt(String resourceId, String principalAttribute) {
        this.resourceId = resourceId;
        this.principalAttribute = principalAttribute;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getPrincipalAttribute() {
        return principalAttribute;
    }

    public void setPrincipalAttribute(String principalAttribute) {
        this.principalAttribute = principalAttribute;
    }
}
