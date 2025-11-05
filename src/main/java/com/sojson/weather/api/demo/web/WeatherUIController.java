package com.sojson.weather.api.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherUIController {

    @RequestMapping("/")
    public String index() {
        return "weather";
    }
}