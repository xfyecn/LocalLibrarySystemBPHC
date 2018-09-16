package com.sharan.admin;


import com.sharan.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import static com.sharan.Main.fileName;

public class AdminSection extends Controller {



    @FXML
    protected BorderPane addLibrarian;

    @FXML
    public void handleButtonClickAddLibrarian(ActionEvent event) throws Exception {
        fileName = "adminOptions/addLibrarian.fxml";
        addLibrarian = FXMLLoader.load(getClass().getResource(fileName));
        adminSection.getChildren().setAll(addLibrarian);
    }
}
