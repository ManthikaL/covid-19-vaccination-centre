package Task04;


import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Controller {
    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    @FXML
    private TextField text4;

    @FXML
    private TextField text5;

    @FXML
    private TextField text6;

    @FXML
    private TextField text7;

    @FXML
    private TextField text8;

    @FXML
    private  TextField text9;

    @FXML
    private Button submit1;

    public void submit_button() throws IOException {
        String firstName = text1.getText();
        String surName = text2.getText();
        String patientAge = text3.getText();
        String patientCity = text4.getText();
        String nicORpassprot = text5.getText();
        String vaccinationRequested = text6.getText();
        String vaccinationDate= text7.getText();
        String vaccinationBooth = text8.getText();
        String vaccinationTime = text9.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Receipt.fxml"));
        Parent root = loader.load();

        Controller1 controller1 = loader.getController();
        controller1.displayName(firstName);
        controller1.displayName2(surName);
        controller1.displayName3(patientAge);
        controller1.displayName4(patientCity);
        controller1.displayName5(nicORpassprot);
        controller1.displayName6(vaccinationRequested);
        controller1.displayName7(vaccinationDate);
        controller1.displayName8(vaccinationBooth);
        controller1.displayName9(vaccinationTime);


        Stage stage = (Stage) submit1.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();




    }
}

