module com.example.pumpkinnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pumpkinnew to javafx.fxml;
    exports com.example.pumpkinnew;
}