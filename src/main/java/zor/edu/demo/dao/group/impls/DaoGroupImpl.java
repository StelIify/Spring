package zor.edu.demo.dao.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zor.edu.demo.dao.group.interfaces.IDaoGroup;
import zor.edu.demo.datastorage.DataFake;
import zor.edu.demo.model.Cafedra;
import zor.edu.demo.model.Group;

import java.util.List;

@Repository
public class DaoGroupImpl implements IDaoGroup
{
    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Cafedra cafedra)
    {
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
    public List<Group> getAll() {
        return dataFake.getGroups();
    }
}
