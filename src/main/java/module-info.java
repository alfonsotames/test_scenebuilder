module com.mycompany.test_scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.test_scenebuilder to javafx.fxml;
    exports com.mycompany.test_scenebuilder;
}
