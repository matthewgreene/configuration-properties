package com.example.configurationproperties.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.file.Path;

@ConfigurationProperties(prefix = "data.paths")
public class PathConfigProperties {
    private Path inboundPath;
    private Path outboundPath;
    private String filename;

    public Path getInboundPath() {
        return inboundPath;
    }

    public void setInboundPath(Path inboundPath) {
        this.inboundPath = inboundPath;
    }

    public Path getOutboundPath() {
        return outboundPath;
    }

    public void setOutboundPath(Path outboundPath) {
        this.outboundPath = outboundPath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
