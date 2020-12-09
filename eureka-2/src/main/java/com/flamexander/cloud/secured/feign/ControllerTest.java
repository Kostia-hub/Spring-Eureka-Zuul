package com.flamexander.cloud.secured.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    private AppClient appClient;

    @Autowired
    public void setGreetingClient(AppClient appClient) {
        this.appClient = appClient;
    }

    @RequestMapping("/get-test")
    public String greeting(Model model) {
        String answer = appClient.test();
        //answer = greetingClient.parametrized("1000");
        model.addAttribute("greeting", answer);
        return "view";
    }
}
