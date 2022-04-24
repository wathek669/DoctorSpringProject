package com.enicarthage.DoctorManagemenetApp.Repository;

import com.enicarthage.DoctorManagemenetApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    void deletePatientById (Long id ) ;
    Optional<Patient> findPatientById(Long id) ;
}
