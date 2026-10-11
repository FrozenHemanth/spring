package com.frozen.wine.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name = "wine")
@NamedQuery(name = "WineEntity.findAll", query = "FROM WineEntity w")
public class WineEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_address")
    private String companyAddress;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;
    private int age;
    private double price;
}
