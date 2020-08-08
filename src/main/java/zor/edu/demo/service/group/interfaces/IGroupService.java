package zor.edu.demo.service.group.interfaces;

import zor.edu.demo.model.Cafedra;
import zor.edu.demo.model.Group;

import java.util.List;

public interface IGroupService
{
    Group create(Cafedra cafedra);
    Group get(String id);
    Group update(Cafedra cafedra);
    Group delete(String id);
    List<Group > getAll();
}
