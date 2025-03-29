package ma.enset.gestion_consultations.service;

import ma.enset.gestion_consultations.entity.ContactMessage;
import ma.enset.gestion_consultations.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {
    private final ContactMessageRepository contactMessageRepository;

    public ContactMessageService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public void saveMessage(ContactMessage contactMessage) {
        contactMessageRepository.save(contactMessage);
    }
}
