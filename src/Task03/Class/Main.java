package Task03.Class;

import java.util.Scanner;

public class Main {
    //Main
    public static void main (String[] args)
    {
        VacinationCenter vacinecenter = new VacinationCenter();   //connect methods with VacinationCenter
        Scanner myScanner = new Scanner(System.in);

        String option="";  //get option as a String to do-while loops

        do {
            System.out.println("COVID-19 VACCINATION CENTER"); //print the menu
            System.out.println("***************************");

            System.out.println("100 or VVB: View all Vaccination Booths");
            System.out.println("101 or VEB: View all Empty Booths");
            System.out.println("102 or APB: Add Patient to a Booth");
            System.out.println("103 or RPB: Remove Patient from a Booth");
            System.out.println("104 or VPS: View Patients Sorted ");
            System.out.println("105 or SPD: Store Program Data");
            System.out.println("106 or LPD: Load Program Data");
            System.out.println("107 or VRV: View Remaining Vaccinations");
            System.out.println("108 or AVS: Add Vaccinations to the Stock");
            System.out.println("999 or EXT: Exit the Program\n");

            System.out.println("Enter a Number to active the Option: ");

            option = myScanner.next();   //get access to all below

            //checking options given from the main
            if (option.equals("100") || option.equals("VVB") || option.equals("vvb")) {
                vacinecenter.viewAllVaccinationBooths();
            }
            else if (option.equals("101") || option.equals("VEB")) {
                vacinecenter.viewAllEmptyBooths();
            } else if (option.equals("102") || option.equals("APB")) {
                System.out.println("Enter Patient Name: ");
                String patientName = myScanner.next();//to input name to add Patient to a Booth

                System.out.println("Enter Booth Number: ");
                int number = myScanner.nextInt(); //to input Booth number to add Patient

                vacinecenter.addPatienttoaBooth(patientName, number);
            }
            else if (option.equals("103") || option.equals("RPB")) {
                System.out.println("Enter patient Name: ");
                String removeName = myScanner.next();//to get the name of patient that we wont to remove

                System.out.println("Select the booth number to remove the patient :");
                int boothNum = myScanner.nextInt();//we have to input the booth number of that remove patient

                vacinecenter.removePatientfromaBooth(removeName, boothNum);
            }
            else if (option.equals("104") || option.equals("VPS")) {
                vacinecenter.viewPatientsSorted();
            }
            else if (option.equals("105") || option.equals("SPD")) {
                vacinecenter.storeProgramData();
            }
            else if (option.equals("106") || option.equals("LPD")) {
                vacinecenter.loadProgramData();
            }
            else if (option.equals("107") || option.equals("VRV")) {
                vacinecenter.viewRemainingVaccinations();
            }
            else if (option.equals("108") || option.equals("AVS")) {
                vacinecenter.addVaccinationstotheStock();
            }
        }while(!option.equals("999") || option.equals("EXT"));  //continue the program run till enter "999" or "EXT" to exit

    }
}
