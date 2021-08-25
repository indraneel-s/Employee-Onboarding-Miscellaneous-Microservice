package com.microservice.entity;


import lombok.*;



import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "original_table")
public class EmployeeDemographics implements Serializable {

    @Id
    private int employeeId;
    private String employeeCode;
    @NotNull
    @Pattern(regexp = "[a-zA-Z]*")
    private String firstName;
    @NotNull
    @Pattern(regexp = "[a-zA-Z]*")
    private String lastName;
    private String dob;
    private String bloodGroup;
    @Column(unique = true)
    private String aadharNumber;
    @Pattern(regexp = "[a-zA-Z]*")
    private String fatherName;
    @Pattern(regexp = "[a-zA-Z]*")
    private String motherName;
    private String emailId;
    @Column(unique = true)
    @Pattern(regexp = "^((\\+91-?)|0)?[0-9]{10}$")
    private String phoneNumber;
    private Double sslc;
    private Double hsc;
    private Double ug;
    private String gender;
    @Pattern(regexp = "[a-zA-Z]*")
    private String emergencyContactName;
    private String emergencyContactRelation;
    @Column(unique = true)
    @Pattern(regexp = "^((\\+91-?)|0)?[0-9]{10}$")
    private String emergencyContactPhoneNumber;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_value")
    private List<Address> addressList;


}
