package com.example.lab5st200528971;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MobileController implements Initializable {

    @FXML
    private ImageView myImage;

    @FXML
    private Label mylabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        MobilePhone myPhone  = new MobilePhone("Image/apple-14-blue-pos1.png","Iphone 12");
        mylabel.setText(myPhone.getModelName());
        System.out.println(myPhone.getModelName());
        myImage.setImage(myPhone.getImage());
    }
}
