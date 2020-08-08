package zor.edu.demo.service.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zor.edu.demo.dao.group.impls.DaoGroupImpl;
import zor.edu.demo.model.Cafedra;
import zor.edu.demo.model.Group;
import zor.edu.demo.repository.GroupRepository;
import zor.edu.demo.service.group.interfaces.IGroupService;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService
{
    @Autowired
    GroupRepository groupRepository;

    @Override
    public Group create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Cafedra cafedra) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List<Group> getAll()
    {
        return  groupRepository.findAll();
    }
}
