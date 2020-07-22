package by.tms.bootstore.controller;


import by.tms.bootstore.entity.order.DeliveryMethod;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(path = "/addBook")
public class AddBookController {


//    public static void main(String[] args) {
//        DeliveryMethod[] values = DeliveryMethod.values();
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i].name());
//        }
//    }

    @GetMapping
    public String form() {
        log.warn("Use this method!");
        return "accountOption/actions/createBook";
    }

}
