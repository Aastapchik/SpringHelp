package org.task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ActionUserController {

    @RequestMapping("/create")
    public String creatingUser(){
        return "create";
    }
}
