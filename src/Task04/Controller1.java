package Task04;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller1 {
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;


    public void displayName(String firstName){
        label1.setText("First name: " +firstName);
    }

    public void displayName2(String surName){
        label2.setText("Surname: " +surName);
    }

    public void displayName3(String patientAge){
        label3.setText("Patient Age: " +patientAge);
    }

    public void displayName4(String patientCity){
        label4.setText("Living City: " +patientCity);
    }

    public void displayName5(String nicORpassprot){
        label5.setText("NIC or Passport: " +nicORpassprot);
    }

    public void displayName6(String vaccinationRequested){
        label6.setText("Vaccination Requested: " +vaccinationRequested);
    }

    public void displayName7(String vaccinationDate){
        label7.setText("vaccinate Date: " +vaccinationDate);
    }

    public void displayName8(String vaccinationBooth){
        label8.setText("vaccinate Booth: " +vaccinationBooth);
    }

    public void displayName9(String vaccinationTime){
        label9.setText("vaccinate Date: " +vaccinationTime);
    }

}
