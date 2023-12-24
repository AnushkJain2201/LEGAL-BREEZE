package models;

import java.sql.Timestamp;

public class Bid {
    // ################### Properties #########################
    private Integer bidId;
    private String issue;
    private String description;
    private Status status;
    private Integer budget;
    private Timestamp deadline;
    private Integer noOfApplicants;
    private User user;

    
    // ################### Constructors #########################
    public Bid() {

    }
    
    
    // ################### Getters-Setters #########################
    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Integer getNoOfApplicants() {
        return noOfApplicants;
    }

    public void setNoOfApplicants(Integer noOfApplicants) {
        this.noOfApplicants = noOfApplicants;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
