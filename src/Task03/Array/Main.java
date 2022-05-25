package Task03.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String firstName;
    static String surName;
    static String vaccinationRequested;
    static int boothNumbers;
    static int availableStock=150;

    //putting all boths as 0
    static String[] vaccinationBoohts = {"Patient=empty", "Patient=empty", "Patient=empty", "Patient=empty", "Patient=empty", "Patient=empty"};

    //get nameofpatients as a arraylist
    static ArrayList<String> patientFirstName = new ArrayList<String>();
    static ArrayList<String> patientSurName = new ArrayList<String>();
    static ArrayList<String> patientVaccinationRequested = new ArrayList<String>();
    static ArrayList<String> nameofpatients = new ArrayList<String>();   //get a arraylist(String)

    //main class
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        boolean Condition = true; //get conditions as boolean(true/false)
        do {
            if (availableStock == 20) {
                System.out.println("No more vaccines available");
            }
            System.out.println("COVID-19 VACCINATION CENTER");        //print the menu
            System.out.println("***************************");

            System.out.println("100 or VVB: View all Vaccination Booths");
            System.out.println("101 or VEB: View all Empty Booths");
            System.out.println("102 or APB: Add Patient to a Booth");
            System.out.println("103 or RPB: Remove Patient from a Booth");
            System.out.println("104 or VPS: View Patients Sorted");
            System.out.println("105 or SPD: Store Program Data");
            System.out.println("106 or LPD: Load Program Data");
            System.out.println("107 or VRV: View Remaining Vaccinations");
            System.out.println("108 or AVS: Add Vaccinations to the Stock");
            System.out.println("999 or EXT: Exit the Program\n");

            System.out.println("Enter a Number to active the Option: ");

            String option = "";           //get option as a String
            option = myScanner.nextLine(); //get scanner to set equals for inputs

            //checking options given from the main
            if (option.equals("100") || option.equals("VVB")) {
                viewAllVaccinationBooths();
            }
            else if (option.equals("101") || option.equals("VEB")) {
                viewAllEmptyBooths();
            }
            else if (option.equals("102") || option.equals("APB")) {
                addPatienttoaBooth();
            }
            else if (option.equals("103") || option.equals("RPB")) {
                removePatientfromaBooth();
            }
            else if (option.equals("104") || option.equals("VPS")) {
                viewPatientsSorted();
            }
            else if (option.equals("105") || option.equals("SPD")) {
                storeProgramData();
            }
            else if (option.equals("106") || option.equals("LPD")) {
                loadProgramData();
            }
            else if (option.equals("107") || option.equals("VRV")) {
                viewRemainingVaccinations();
            }
            else if (option.equals("108") || option.equals("AVS")) {
                addVaccinationstotheStock();
            }
            else if (option.equals("999") || option.equals("EXT")) {
                Condition = true;
            }
        }
        while(Condition);

    }

    //Methods

    //show all vaccination booths
    public static void viewAllVaccinationBooths()
    {
        System.out.println("View All Vaccination Booths");
        for(int i=1; i<(vaccinationBoohts.length+1); i++) {
            System.out.println("booth number " + i + "=" + vaccinationBoohts[i-1]); //display all booths
        }                                                                    //from this booth will 0
    }

    //show all empty booths
    public static void viewAllEmptyBooths()
    {
        for(int x=1; x<(vaccinationBoohts.length+1); x++){
            if(vaccinationBoohts[x-1].equals("Patient=empty")){  //(Patient=empty) = empty booth
                System.out.println("Booth number " + x + " is empty"); //display every empty booth
            }
        }
    }

    //add paitient to a booth
    public static void addPatienttoaBooth()
    {
        System.out.println("Select the booth number (1-6) :");      //adding the booth number

        boothNumbers = new Scanner(System.in).nextInt();
        System.out.println("Enter the name of patient for booth number "+ boothNumbers);
        System.out.println("Patient First name: ");

        //add patient to the booth number above called
        firstName = new Scanner(System.in).nextLine();
        patientFirstName.add(firstName);         //input Patient firstname

        System.out.println("Patient Surname: ");
        surName = new Scanner(System.in).nextLine();
        patientSurName.add(surName);             //input Patient Surname

        System.out.println("Vaccination Requested(AstraZeneca,Sinopharm,Pfizer): ");
        vaccinationRequested = new Scanner(System.in).nextLine();
        patientVaccinationRequested.add(vaccinationRequested);         //input requested vaccine

        vaccinationBoohts[boothNumbers-1] = firstName +" "+ surName+" "+vaccinationRequested;    //display first name, surname and requested vaccine

        availableStock = availableStock-1;     //availabel stock will be = availableStock-1(when we input a paitent)
    }

    //remove patient from a booth
    public static void removePatientfromaBooth()
    {
        System.out.println("Select the booth number to remove the patient :");

        boothNumbers = new Scanner(System.in).nextInt();
        vaccinationBoohts[boothNumbers-1] = "Patient=empty";  //Display again as empty
    }

    //view paitent sorted
    public static void viewPatientsSorted()
    {
        for (int i = 0; i<nameofpatients.size(); i++){
            for (int j = i+1; j<nameofpatients.size(); j++){
                int k =nameofpatients.get(i).compareTo(nameofpatients.get(j));
                if (i >0){
                    String temporary = nameofpatients.get(i);
                    nameofpatients.set(i, nameofpatients.get(j));
                    nameofpatients.set(j, temporary);
                }
            }System.out.println(nameofpatients.get(i));
        }
    }

    //show program data
    public static void storeProgramData()
    {

        System.out.println("Number of available vaccines =" + availableStock);  //display available vaccine stock
    }

    //load program data
    public static void loadProgramData()
    {
        System.out.println("Enter the number of vaccines you want to add to the stock");

        int addStock = new Scanner(System.in).nextInt();
        availableStock = availableStock + addStock ;
    }

    //show available vaccine
    public static void viewRemainingVaccinations()
    {
        System.out.println("Number of remaining stock: "+ availableStock);  //display available stock
    }

    //add more vaccines to available stock
    public static void addVaccinationstotheStock()
    {
        System.out.println("Enter the number of vaccine add to the stock");

        int addStock = new Scanner(System.in).nextInt();   //get scanner to additional stock
        availableStock = availableStock + addStock;       //add stock for available stock
    }

}


