package ma.enset.gestion_consultations;

import ma.enset.gestion_consultations.entity.Consultation;
import ma.enset.gestion_consultations.entity.Patient;
import ma.enset.gestion_consultations.repository.ConsultationRepository;
import ma.enset.gestion_consultations.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.lang.String;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionConsultationsApplication implements CommandLineRunner {

    PatientRepository patientRepository;
    ConsultationRepository consultationRepository;

    public GestionConsultationsApplication(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionConsultationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Patient patient = new Patient("Tazi", "Ahmed", "Ahmed@gmail.com", "0673959444");

        patientRepository.save(patient);*/
        Patient patient=patientRepository.findById(2L).get();
        /*patient.setNom("Ahmadi");
        patient.setPrenom("Asmae");
        patient.setTel("0764344555");
        patientRepository.save(patient);*/
       /* Consultation consultation=new Consultation();
        consultation.setDateConsultation(Date.valueOf(LocalDate.of(2023, Month.AUGUST,27)));
        consultation.setDescription("Consultation 1");
        consultation.setPatient(patient);

        consultationRepository.save(consultation);*/
    }
}
