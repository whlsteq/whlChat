package com.whlsteq.whlchat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea txtarea_message;
    @FXML
    private TextField txt_nickname;
    private String nickname;

    public void take_nickname(ActionEvent actionEvent) {
        if (!txt_nickname.getText().equals(null)){
            nickname=txt_nickname.getText();
            txt_nickname.setEditable(false);
            System.out.println(txt_nickname.getText());
        }else{

        }

    }
}