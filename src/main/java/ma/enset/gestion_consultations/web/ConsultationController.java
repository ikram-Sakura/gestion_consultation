package ma.enset.gestion_consultations.web;

import ma.enset.gestion_consultations.entity.Consultation;
import ma.enset.gestion_consultations.entity.Patient;
import ma.enset.gestion_consultations.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RequestMapping("/consultations")
public class ConsultationController {
    private CabinetService cabinetService;

    public ConsultationController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping()
    public String getAllConsultations(Model model) {
        List<Consultation> consultations = cabinetService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "consultations";
    }

    @GetMapping("/new")
    public String newConsultation(Model model) {;
        List<Patient> patients=cabinetService.getAllPatients();
        Consultation consultation=new Consultation();
        model.addAttribute("patients",patients);
        model.addAttribute("consultation",consultation);
        return "newConsultation";
    }

    @PostMapping()
    public String saveConsultation(@ModelAttribute Consultation consultation, @RequestParam Long idPatient) {
        cabinetService.addConsultation(consultation, idPatient);
        return "redirect:/consultations";
    }

    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") Long id) {
        cabinetService.deleteConsultationById(id);
        return "redirect:/consultations";
    }

    @GetMapping("/edit/{id}")
    public String editConsultation(Model model, @PathVariable("id") Long id) {
        model.addAttribute("consultation", cabinetService.getConsultationById(id));
        model.addAttribute("patients", cabinetService.getAllPatients());
        return "edit_consultation";
    }
}
