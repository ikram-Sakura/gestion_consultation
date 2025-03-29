package ma.enset.gestion_consultations.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idPatient;
    @Column(length = 100,nullable = false)
    private String nom;
    @Column(length = 100)
    private String prenom;
    @Column(length = 30)
    private String email;
    @Column(length = 20)
    private String tel;
    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations;

    public Patient() {
    }

    public Patient(String nom, String prenom, String email, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", consultations=" + consultations +
                '}';
    }


}
