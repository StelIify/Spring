package zor.edu.demo.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zor.edu.demo.model.Cafedra;
import zor.edu.demo.model.Group;
import zor.edu.demo.repository.CafedraRepository;
import zor.edu.demo.repository.GroupRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake
{
    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;

    List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ", "Ivanov", "Engineering"),
            new Cafedra("KN", "Sidorov", "MSOffice"),
            new Cafedra("IT", "Pshek", "VIt")
    ));

    List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group( "543", "ChNu", cafedras.get(0)),
            new Group("KN-42", "UzhNU", cafedras.get(1)),
            new Group("6.04.51.15.01", "KhNEU", cafedras.get(2))
    ));

    @PostConstruct
        private void init()
    {
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
    }


    public List<Group> getGroups()
            {
                return groups;
            }

            public void setGroups(List<Group> groups)
            {
                this.groups = groups;
            }
            public List<Cafedra> getCafedras()
            {
                return cafedras;
            }
            public void setCafedras(List<Cafedra> cafedras)
            {
                this.cafedras = cafedras;
            }
}
