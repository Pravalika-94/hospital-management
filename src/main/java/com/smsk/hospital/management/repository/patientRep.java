package com.smsk.hospital.management.repository;

import com.smsk.hospital.management.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRep extends JpaRepository<patient,Long >
{

}



