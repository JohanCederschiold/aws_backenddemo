package se.jpdc.restdemos.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.jpdc.restdemos.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
}
