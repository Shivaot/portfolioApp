package com.shivaot.portfolio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPortfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private String name;
    private String username;
    private String email;
    private long phoneNumber;
    private String facebookHandle;
    private String linkedinHandle;
    private String instagramHandle;
    private String profession;
    private String currentRegion;
    private String bio;

    public UserPortfolio() {
    }

    public UserPortfolio( String name, String username, String email, long phoneNumber, String facebookHandle, String linkedinHandle, String instagramHandle, String profession, String currentRegion, String bio) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.facebookHandle = facebookHandle;
        this.linkedinHandle = linkedinHandle;
        this.instagramHandle = instagramHandle;
        this.profession = profession;
        this.currentRegion = currentRegion;
        this.bio = bio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFacebookHandle() {
        return facebookHandle;
    }

    public void setFacebookHandle(String facebookHandle) {
        this.facebookHandle = facebookHandle;
    }

    public String getLinkedinHandle() {
        return linkedinHandle;
    }

    public void setLinkedinHandle(String linkedinHandle) {
        this.linkedinHandle = linkedinHandle;
    }

    public String getInstagramHandle() {
        return instagramHandle;
    }

    public void setInstagramHandle(String instagramHandle) {
        this.instagramHandle = instagramHandle;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(String currentRegion) {
        this.currentRegion = currentRegion;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
