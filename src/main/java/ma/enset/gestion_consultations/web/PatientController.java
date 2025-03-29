package ma.enset.gestion_consultations.web;



import ma.enset.gestion_consultations.entity.Patient;
import ma.enset.gestion_consultations.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RequestMapping("/patients")
public class PatientController {
    private CabinetService cabinetService;

        public PatientController(CabinetService cabinetService) {
            this.cabinetService = cabinetService;
        }

        @GetMapping()
        public String getPatients(Model model){
            List<Patient> patients=cabinetService.getAllPatients();
            model.addAttribute("patients",patients);
            return "patients";
        }

        @GetMapping("/new")
        public String newPatient(Model model){
            Patient patient=new Patient();
            model.addAttribute("patient",patient);
            return "newPatient";
        }

        @PostMapping()
        public String savePatient(@ModelAttribute Patient patient){
            System.out.println(patient);
            cabinetService.savePatient(patient);
            return "redirect:/patients";
        }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") Long id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }

    @GetMapping("/edit/{id}")
    public String editPatient(Model model,@PathVariable("id") Long id){
          Patient patient= cabinetService.getPatientByID(id);
          model.addAttribute("patient",patient);
          return "edit_patient";
    }
}
