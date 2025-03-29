package ma.enset.gestion_consultations.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AccueilController {
    @GetMapping("/")
    public String showAccueilPage() {
        return "accueil";
    }
}
