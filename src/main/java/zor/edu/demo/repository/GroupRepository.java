package zor.edu.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zor.edu.demo.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, String>
{

}
