package com.codegym.controller;

import com.codegym.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMailbox {

    @GetMapping
    public String showSettingBoxMail() {
        return "setting";
    }
    @PostMapping("/setting")
    public ModelAndView daSuaXong(@RequestParam String language,
                                  @RequestParam int size,
                                  @RequestParam boolean spamfilter,
                                  @RequestParam String signature) {
        MailBox mailbox = new MailBox(language,size,spamfilter,signature);
        ModelAndView modelAndView = new ModelAndView("result","mailbox",mailbox);
        return modelAndView;
    }

}
