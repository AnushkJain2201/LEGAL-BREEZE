package models;

import java.sql.Date;

public class Bid {
    // ################### Properties #########################
    private Integer bidId;
    private String issue;
    private String description;
    private Integer hearings;
    private Status status;
    private Integer budget;
    private Date startDate;
    private Date deadline;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
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

    public Integer getHearings() {
        return hearings;
    }

    public void setHearings(Integer hearings) {
        this.hearings = hearings;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
