package pl.grucha.education.spring.test1;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by michal on 04/12/15.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
