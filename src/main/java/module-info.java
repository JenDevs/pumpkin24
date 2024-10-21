module com.example.pumpkinnew {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pumpkinnew to javafx.fxml;
    exports com.example.pumpkinnew;
}