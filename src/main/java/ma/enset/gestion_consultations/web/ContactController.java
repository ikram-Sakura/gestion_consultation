package ma.enset.gestion_consultations.web;

import ma.enset.gestion_consultations.entity.ContactMessage;
import ma.enset.gestion_consultations.service.ContactMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String showContactForm(Model model) {
        model.addAttribute("contactMessage", new ContactMessage());
        return "contact";
    }

    @PostMapping("/send")
    public String handleContactForm(@ModelAttribute ContactMessage contactMessage, Model model) {
        ContactMessageService contactMessageService = null;
        contactMessageService.saveMessage(contactMessage);
        model.addAttribute("successMessage", "Your message has been sent successfully!");
        return "contact";
    }


}
