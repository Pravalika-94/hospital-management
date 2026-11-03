package com.smsk.hospital.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable= false,unique=true)
    private String patientCode;
    @Column(nullable=false )
    private String name;
    @Column(nullable = false,length = 20)
    private int age;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String bloodGroup;
    @Column(nullable = false,unique = true  )
    private Long  aadharNumber;
    @Column(nullable = false)
    private String gender;
}
