package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.academy.dto.SignInForm;
import ra.academy.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ModelAndView loginform() {
        ModelAndView model = new ModelAndView();
        model.setViewName("sign-in");
        model.addObject("loginform", new SignInForm());
        return model;
    }

    @PostMapping("/sign-in")
    public String doLogin(@ModelAttribute("formlogin") SignInForm formlogin , BindingResult bindingResult , HttpSession session) {
        // kiểm tra tính đúng đắn của dữ liệu

        return "home";
    }
}
