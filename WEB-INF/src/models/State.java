package models;

public class State {
    // ################### Properties #########################
    private Integer stateId;
    private String name;

    // ################### Constructors #########################
    public State() {

    }

    // ################### Getters-Setters #########################
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
