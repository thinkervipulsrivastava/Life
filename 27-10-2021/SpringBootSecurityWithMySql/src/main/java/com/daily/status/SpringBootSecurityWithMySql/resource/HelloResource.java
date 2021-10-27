package com.daily.status.SpringBootSecurityWithMySql.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Two rest End Point created
@RequestMapping ("/rest/hello")
@RestController
public class HelloResource {

    @GetMapping ("/all")
    public String hello () {
        return "Hello World";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping ("/secured/all")
    public String securedHello () {
        return "secured all";
    }

    @GetMapping ("/secured/alt")
    public String securedalt () {
        return "secured alternate";
    }
}
