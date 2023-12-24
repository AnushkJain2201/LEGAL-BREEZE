package models;

import java.sql.Timestamp;

public class User {
    // ################### Properties #########################
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private String pincode;
    private Country country;
    private State state;
    private Gender gender;
    private UserType userType;
    private Category category;
    private Integer experience;
    private String profilePic;
    private Badge badge;
    private Timestamp joinedOn;
    private Integer casesFought;
    private Integer casesWon;
    private Integer successRatio;
    private Status status;
    private Integer aadharId;

    
    // ################### Constructors #########################
    public User() {

    }

    
    // ################### Getters-Setters #########################
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public Timestamp getJoinedOn() {
        return joinedOn;
    }

    public void setJoinedOn(Timestamp joinedOn) {
        this.joinedOn = joinedOn;
    }

    public Integer getCasesFought() {
        return casesFought;
    }

    public void setCasesFought(Integer casesFought) {
        this.casesFought = casesFought;
    }

    public Integer getCasesWon() {
        return casesWon;
    }

    public void setCasesWon(Integer casesWon) {
        this.casesWon = casesWon;
    }

    public Integer getSuccessRatio() {
        return successRatio;
    }

    public void setSuccessRatio(Integer successRatio) {
        this.successRatio = successRatio;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getAadharId() {
        return aadharId;
    }

    public void setAadharId(Integer aadharId) {
        this.aadharId = aadharId;
    }
}
