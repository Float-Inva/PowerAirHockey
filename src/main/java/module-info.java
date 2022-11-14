module com.example.a2dproject_powerairhockey {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.a2dproject_powerairhockey to javafx.fxml;
    exports com.example.a2dproject_powerairhockey;
}