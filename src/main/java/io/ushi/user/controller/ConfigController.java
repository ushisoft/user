package io.ushi.user.controller;

import io.ushi.user.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/config/v1")
public class ConfigController {

    @Autowired
    UserConfig userConfig;

    @GetMapping(value = "")
    public String showConfig() {
        return "admin: " + userConfig.getAdmin() + ", pass: " + userConfig.getAdminPass();
    }
}
