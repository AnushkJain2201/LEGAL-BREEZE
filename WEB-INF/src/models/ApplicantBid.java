package models;

public class ApplicantBid {
    // ################### Properties #########################
    private Integer applicantBidId;
    private Bid bid;
    private User user;

    // ################### Constructors #########################
    public ApplicantBid() {

    }
    // ################### Getters-Setters #########################

    public Integer getApplicantBidId() {
        return applicantBidId;
    }

    public void setApplicantBidId(Integer applicantBidId) {
        this.applicantBidId = applicantBidId;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
