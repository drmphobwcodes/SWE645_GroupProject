package com.swe645.hw3.model;

import javax.persistence.*;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "SURVEY")
public class SurveyForm {
	
	private String studentId;

    private String firstName;
    private String lastName;
    private String phone;
    private String streetAddress;
    private String unit;
    private Long zipcode;
    private String url;
    private String city;
    private String state;
    private String liked;
    private String interest;
    private String likelihood;
    private String graduationMonth;
    private Long graduationYear;
    private String dateOfVisit;
    private String comments;
    private String email;
    private String data;



    @Id
    @Column(name = "STUDENT_ID")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "STREET_ADDRESS")
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Basic
    @Column(name = "UNIT")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "ZIPCODE")
    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "LIKED")
    public String getLiked() {
        return liked;
    }

    public void setLiked(String liked) {
        this.liked = liked;
    }

    @Basic
    @Column(name = "INTEREST")
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    
    @Column(name = "LIKELIHOOD")
    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    
    @Column(name = "GRADUATION_MONTH")
    public String getGraduationMonth() {
        return graduationMonth;
    }

    public void setGraduationMonth(String graduationMonth) {
        this.graduationMonth = graduationMonth;
    }

 
    @Column(name = "GRADUATION_YEAR")
    public Long getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Long graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Column(name = "DATE_OF_VISIT")
    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    
    @Column(name = "COMMENTS")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

  
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 
    @Column(name = "DATA")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
