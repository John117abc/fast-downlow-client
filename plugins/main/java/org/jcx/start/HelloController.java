package org.jcx.start;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
/**
 * @ClassName: org.jcx.start.HelloController
 * @Author: 姜丞轩
 * @Description:
 * @Date: 2022/3/11 22:53
 */

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
