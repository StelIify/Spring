package zor.edu.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zor.edu.demo.model.Cafedra;
import zor.edu.demo.service.cafedra.impls.CafedralServiceImpl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("api/cafedra")
@RestController
public class CafedraRestController
{
    @Autowired
    CafedralServiceImpl service;

    @RequestMapping("/hello")
    String getHello(){
        return "Hello from Cafedra Controller ";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList()
    {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id)
    {
        return service.get(id);
    }

}
