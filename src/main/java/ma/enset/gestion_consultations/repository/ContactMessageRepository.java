package ma.enset.gestion_consultations.repository;

import ma.enset.gestion_consultations.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
