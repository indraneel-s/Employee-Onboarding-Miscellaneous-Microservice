package com.microservice.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "original_address_table")
public class Address implements Serializable {

    @Id
    private int addressId;
    @Column
    private String employeeCode;
    @Column
    @NotNull

    private String type;
    @Column
    @NotNull
    private String flatName;
    @Column
    @NotNull
    private String streetName;
    @Column
    @NotNull

    private String area;
    @Column
    @NotNull

    private String state;

    @Column
    @NotNull

    private String country;
    @Column
    @NotNull

    private String city;
    @Column
    @NotNull
    private String pinCode;
    @Column
    @NotNull
    private String mapCoordinates;
}