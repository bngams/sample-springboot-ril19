package fr.cesi.rila19.samplespringdemo.repositories;

import fr.cesi.rila19.samplespringdemo.entities.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository
        extends CrudRepository<Contact, Long> {

    // findBy <=> Select from contacts where lastname
    List<Contact> findByName(String lastname);

    @Query(value="SELECT * FROM contacts " +
            "WHERE firstname " +
            "LIKE %:word% " +
            "OR lastname LIKE %:word%", nativeQuery = true)
    List<Contact> search(String word);
}
