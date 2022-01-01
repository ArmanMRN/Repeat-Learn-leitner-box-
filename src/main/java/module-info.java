module com.example.repeatlearn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires com.jfoenix;


    opens com.example.repeatlearn to javafx.fxml;
    exports com.example.repeatlearn;
    exports com.example.repeatlearn.controller;
    opens com.example.repeatlearn.controller to javafx.fxml;
}