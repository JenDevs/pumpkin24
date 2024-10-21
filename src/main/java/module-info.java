module com.example.pumpkinnew {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pumpkinnew to javafx.fxml;
    exports com.example.pumpkinnew;
    exports com.example.pumpkinnew.controller;
    opens com.example.pumpkinnew.controller to javafx.fxml;
    exports com.example.pumpkinnew.model;
    opens com.example.pumpkinnew.model to javafx.fxml;
    exports com.example.pumpkinnew.fxcontrols;
    opens com.example.pumpkinnew.fxcontrols to javafx.fxml;
}