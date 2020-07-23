package by.tms.bootstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @GetMapping(path = "/cart")
    public String cartG() {
        return "";
    }

    @PostMapping(path = "/cart")
    public String cartP() {
        return "";
    }

    @GetMapping(path = "/pay")
    public String payG() {
        return "";
    }

    @PostMapping(path = "/pay")
    public String payP() {
        return "";
    }


}
