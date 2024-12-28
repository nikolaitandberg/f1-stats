package no.nikolaitandberg.f1data.driver;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.beans.ConstructorProperties;
import java.sql.Date;

@Entity
@Table(name="drivers")
public class Driver {
    @Column(name = "driverid")
    private Integer driverId;
    @Id
    @Column(name = "driverref", unique = true)
    private String driverRef;
    private Integer number;
    private String code;
    @Column(name = "forename")
    private String firstName;
    @Column(name = "surname")
    private String lastName;
    private Date dob;
    private String nationality;
    private String url;

    // default constructor

    public Driver() {
    }

    //parameterized constructor

    public Driver(Integer driverId, String driverRef, Integer number, String code, String firstName, String lastName, Date dob, String nationality, String url) {
        this.driverId = driverId;
        this.driverRef = driverRef;
        this.number = number;
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.nationality = nationality;
        this.url = url;
    }

    // Getters

    public Integer getDriverId() {
        return driverId;
    }

    public String getDriverRef() {
        return driverRef;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getNationality() {
        return nationality;
    }

    public String getUrl() {
        return url;
    }

    // Setters

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public void setDriverRef(String driverRef) {
        this.driverRef = driverRef;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
