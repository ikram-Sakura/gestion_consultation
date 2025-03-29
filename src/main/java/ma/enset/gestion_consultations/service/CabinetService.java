package ma.enset.gestion_consultations.service;

import ma.enset.gestion_consultations.entity.Consultation;
import ma.enset.gestion_consultations.entity.Patient;

import java.util.List;

public interface CabinetService {
    void savePatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientByID(Long id);
    void updatePatient(Patient patient);
    void deletePatientById(Long id);

    void addConsultation(Consultation consultation, Long idPatient);
    List<Consultation> getAllConsultations();
    void updateConsultation(Consultation consultation, Long idPatient);
    void deleteConsultationById(Long id);
    Consultation getConsultationByID(Long id);

    Object getConsultationById(Long id);
}
