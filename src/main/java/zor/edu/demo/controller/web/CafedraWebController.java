package zor.edu.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zor.edu.demo.service.cafedra.impls.CafedralServiceImpl;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController
{
    @Autowired
    CafedralServiceImpl cafedralService;

    @RequestMapping("get/list")
    String showAll(Model model)
    {
        model.addAttribute("list", cafedralService.getAll());
        return "cafedralist";

    }


}
