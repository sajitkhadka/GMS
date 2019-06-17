package com.gms.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController{

    @FXML
    Button loginButton;
    public void login(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) loginButton.getScene().getWindow();
        // do what you have to do
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("/view/member/member.fxml"));
        Stage memberStage = new Stage();
        memberStage.getIcons().add(new Image("/images/logo.png"));

        memberStage.setScene(new Scene(root, 900, 600));
        memberStage.setResizable(true);

         memberStage.show();
    }
}
