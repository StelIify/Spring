package zor.edu.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zor.edu.demo.model.Cafedra;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra, String>
{

}
