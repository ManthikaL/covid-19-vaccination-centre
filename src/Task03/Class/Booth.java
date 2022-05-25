package Task03.Class;

public class Booth {
    private int boothNum;
    private boolean empty;
    private String patientName;

    public Booth(String number){
        this.boothNum = boothNum;
        this.empty = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getNumber(){
        return boothNum;
    }

    public void setNumber(int number){
        this.boothNum = number;
    }

    public String getpatientName(){
        return patientName;
    }


    public void setpatientName(String patientName){
        this.patientName = patientName;
    }
}
