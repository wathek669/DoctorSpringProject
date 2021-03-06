package com.enicarthage.DoctorManagemenetApp.service;


import com.enicarthage.DoctorManagemenetApp.Repository.PatientRepo;
import com.enicarthage.DoctorManagemenetApp.exception.UserNotFoundException;
import com.enicarthage.DoctorManagemenetApp.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientService {
    private final PatientRepo patientRepo ;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }
    public Patient addPatient (Patient patient) {
        return patientRepo.save(patient) ;
    }

    public void deletePatient(Long id) {patientRepo.deletePatientById(id) ;}

    public Patient findPatientById(Long id ) {
        return  patientRepo.findPatientById(id).orElseThrow(() -> new UserNotFoundException("Patient by id " +id +"not found ")) ;
    }

    public List<Patient> findAllPatients() {
        return (List<Patient>)patientRepo.findAll() ;
    }

    public Patient updateEmployee(Patient patient) {
        return patientRepo.save(patient) ;
    }

    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient) ;
    }
}
