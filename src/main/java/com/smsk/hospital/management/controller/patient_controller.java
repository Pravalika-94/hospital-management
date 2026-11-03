package com.smsk.hospital.management.controller;

import com.smsk.hospital.management.entity.patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.smsk.hospital.management.service.patientSer;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class patient_controller {
    private final patientSer con;

    @GetMapping("/getall")
    public List<patient> getall(){
        return con.getall();

    }

    @GetMapping("/getbyid/{id}")
    public patient getbyid(@PathVariable Long id){
        return con.getbyId(id);
    }

    @PostMapping("/insert")
    public patient insert(@RequestBody patient data) {
        return con.insert(data);
    }

    @PutMapping("/update/{id}")
    public patient update(@RequestBody patient new_data, @PathVariable Long id){
       return con.update(id, new_data);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id ){
        con.delete(id);}

}
