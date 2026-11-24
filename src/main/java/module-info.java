module com.mycompany.ej22223 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej22223 to javafx.fxml;
    exports com.mycompany.ej22223;
}
