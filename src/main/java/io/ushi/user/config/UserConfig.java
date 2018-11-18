package io.ushi.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("ushi.user")
@RefreshScope
public class UserConfig {

    String admin;

    String adminPass;
}
