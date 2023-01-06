package ru.mcs.blogging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.mcs.blogging.models.BlogUser;

@Controller
@SessionAttributes("blogUser")
public class SignupController {

    @GetMapping("/signup")
    public String getRegisterForm(Model model) {

        BlogUser blogUser = new BlogUser();
        model.addAttribute("blogUser", blogUser);
        return "registerForm";
    }
}
