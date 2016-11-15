package dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Volenteer;
@Repository
public interface VolenteerDao extends CrudRepository<Volenteer, Integer> {

}
