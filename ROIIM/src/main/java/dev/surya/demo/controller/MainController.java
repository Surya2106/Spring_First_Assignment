package dev.surya.demo.controller;

import javax.validation.Valid;

import dev.surya.demo.model.User;
import dev.surya.demo.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.atomic.AtomicReference;


@Controller
public class MainController {

    @GetMapping("/login")
    public String loginPage(){
        return "loginPage";
    }



}