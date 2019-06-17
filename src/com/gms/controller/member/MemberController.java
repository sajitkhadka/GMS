package com.gms.controller.member;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MemberController implements Initializable{
    @FXML
    VBox rootPane;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {

            VBox pane = FXMLLoader.load(getClass().getResource("/view/member/memberHome.fxml"));
            rootPane.getChildren().setAll(pane);
        }
        catch(IOException e){

        }
    }

    public void homeClicked(MouseEvent mouseEvent) {
        try {

            VBox profilePane = FXMLLoader.load(getClass().getResource("/view/member/memberHome.fxml"));
            rootPane.getChildren().setAll(profilePane);
        }
        catch(IOException e){

        }
    }
    public void profileClicked(MouseEvent mouseEvent) {
        try {

            VBox profilePane = FXMLLoader.load(getClass().getResource("/view/member/memberProfile.fxml"));
            rootPane.getChildren().setAll(profilePane);
        }
        catch(IOException e){

        }
    }

    public void preferencesClicked(MouseEvent mouseEvent) {
        try {

            VBox profilePane = FXMLLoader.load(getClass().getResource("/view/member/memberPreferences.fxml"));
            rootPane.getChildren().setAll(profilePane);
        }
        catch(IOException e){

        }
    }

    public void settingsClicked(MouseEvent mouseEvent) {
        try {

            VBox profilePane = FXMLLoader.load(getClass().getResource("/view/member/memberSetting.fxml"));
            rootPane.getChildren().setAll(profilePane);
        }
        catch(IOException e){

        }
    }

    public void aboutClicked(MouseEvent mouseEvent) {
        try {

            VBox profilePane = FXMLLoader.load(getClass().getResource("/view/about.fxml"));
            rootPane.getChildren().setAll(profilePane);
        }
        catch(IOException e){

        }
    }
}
