package com.example.configurationproperties;

import com.example.configurationproperties.config.properties.PathConfigProperties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/properties")
public class TestController {

    private final PathConfigProperties fileProperties;

    public TestController(@Qualifier("box") PathConfigProperties fileProperties) {
        this.fileProperties = fileProperties;
    }

    @GetMapping
    public PathConfigProperties getInboundPath() {
        return fileProperties;
    }
}
