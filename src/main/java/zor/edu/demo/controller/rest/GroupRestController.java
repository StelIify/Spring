package zor.edu.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zor.edu.demo.model.Group;
import zor.edu.demo.service.group.impls.GroupServiceImpl;

import java.util.List;

@RequestMapping("api/group")
@RestController
public class GroupRestController
{
    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGeoups()
    {
        return groupService.getAll();
    }


}
