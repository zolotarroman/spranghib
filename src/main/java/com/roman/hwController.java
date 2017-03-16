package com.roman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by roman on 3/2/17.
 */

@Controller
public class hwController {

    @RequestMapping("/hello")
    public String showHelloWorld(){
        return "hello-world";
    }

    /*@RequestMapping("/error")
    public String showError(){
        return "templates/hello-world";
    }*/
}
