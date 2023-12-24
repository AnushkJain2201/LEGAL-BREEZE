package models;

public class UserType {
    // ################### Properties #########################
    private Integer userTypeId;
    private String name;

    // ################### Constructors #########################
    public UserType(){
        
    }
    

    // ################### Getters-Setters #########################
    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}
