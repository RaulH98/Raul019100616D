module com.example.proyectoraul {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoraul to javafx.fxml;
    exports com.example.proyectoraul;
}