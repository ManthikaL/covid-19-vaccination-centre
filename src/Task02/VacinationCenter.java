package Task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VacinationCenter {
    Booth[] vaccinationBooths;
    int vaccineCount;
    String[] patients;
    int lastPatient=-1;

    public VacinationCenter(){             //constructor
        this.vaccinationBooths = new Booth[6];
        this.patients = new String[150];
        initialize(this.vaccinationBooths);
        this.vaccineCount = 150;
    }

    private void initialize(Booth[] booths) {
        for(int i=0; i<booths.length; i++){
            booths[i] = new Booth(i+1);
        }
    }


    //show all vaccination booths
    public void viewAllVaccinationBooths(){
        for (Booth booth: vaccinationBooths) {
            System.out.println("Booth Number: " + booth.getNumber());
            System.out.println("Booth Patient: " + !booth.isEmpty());
        }

    }

    //show all empty booths
    public void viewAllEmptyBooths(){
        for (Booth booth: vaccinationBooths){
            if(booth.isEmpty()){
                System.out.println("Booth Number: " + booth.getNumber());
                System.out.println("Booth Patient: " + !booth.isEmpty());
            }
        }
    }

    //add paitient to a booth
    public void addPatienttoaBooth(String patientName, int boothNum){
        vaccinationBooths[boothNum-1].setEmpty(false);
        int newPatientIndex = lastPatient + 1;
        patients[newPatientIndex] = patientName;
    }

    //remove patient from a booth
    public void removePatientfromaBooth(String removeName, int boothNum){
        vaccinationBooths[boothNum-1].setEmpty(true);  //Display again as true after removing patient
    }

    //view paitent sorted
    public void viewPatientsSorted(){

    }

    //show program data
    public void storeProgramData(){

    }

    //load program data
    public void loadProgramData(){
        try {
            File loadPro = new File("Patient_Data.txt"); // get the File class
            Scanner dataRead = new Scanner(loadPro);
            while (dataRead.hasNextLine()) {
                String patientData = dataRead.nextLine();
                System.out.println(patientData);
            }
            dataRead.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is an error in this!"); // import this class to handle errors
            e.printStackTrace();
        }
    }

    //show available vaccine
    public void viewRemainingVaccinations(){
        System.out.println("Number of remaining stock: " +vaccineCount);
    }

    //add more vaccines to available stock
    public void addVaccinationstotheStock(){
        System.out.println("Enter the number of vaccine add to the stock");

        int addStock = new Scanner(System.in).nextInt();    //get scanner to additional stock
        vaccineCount = vaccineCount + addStock;  //add stock for available stock
    }

}
