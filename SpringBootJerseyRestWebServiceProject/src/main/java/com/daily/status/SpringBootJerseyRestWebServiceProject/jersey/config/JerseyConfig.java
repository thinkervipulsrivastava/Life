package com.daily.status.SpringBootJerseyRestWebServiceProject.jersey.config;

import com.daily.status.SpringBootJerseyRestWebServiceProject.service.UserRestService;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig () {
        register (UserRestService.class);
    }
}
