package Spring_CircleCI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {
    @RequestMapping("/user")
    public String registerUser(){
        return "user";
    }
}
