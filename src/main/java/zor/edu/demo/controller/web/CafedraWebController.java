package zor.edu.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController
{
    @RequestMapping("get/list")
    String showAll(){
        return "cafedralist";
    }
}
