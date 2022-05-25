package Task03.Class;

public class Patient {
    private String firstName;
    private String surName;
    private int patienAge;
    private String patienCity;
    private int nicorpassport;

    public Patient(String firstName, String surName, int patienAge, String patienCity, int nicorpassport){
        this.firstName = firstName;
        this.surName = surName;
        this.patienAge = patienAge;
        this.patienCity = patienCity;
        this.nicorpassport = nicorpassport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPatienAge() {
        return patienAge;
    }

    public void setPatienAge(int patienAge) {
        this.patienAge = patienAge;
    }

    public String getPatienCity() {
        return patienCity;
    }

    public void setPatienCity(String patienCity) {
        this.patienCity = patienCity;
    }

    public int getNicorpassport() {
        return nicorpassport;
    }

    public void setNicorpassport(int nicorpassport) {
        this.nicorpassport = nicorpassport;
    }
}
