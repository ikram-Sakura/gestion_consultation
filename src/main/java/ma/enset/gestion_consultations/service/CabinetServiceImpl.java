package ma.enset.gestion_consultations.service;

import ma.enset.gestion_consultations.entity.Consultation;
import ma.enset.gestion_consultations.entity.Patient;
import ma.enset.gestion_consultations.repository.ConsultationRepository;
import ma.enset.gestion_consultations.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CabinetServiceImpl implements CabinetService {

    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientByID(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }


    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public void addConsultation(Consultation consultation, Long idPatient) {
        Patient patient=patientRepository.findById(idPatient).get();
        consultation.setPatient(patient);
        consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public void updateConsultation(Consultation consultation, Long idPatient) {
        consultationRepository.save(consultation);
    }

    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }

    @Override
    public Consultation getConsultationByID(Long id) {
        return null;
    }

    @Override
    public Object getConsultationById(Long id) {
        return null;
    }
}
