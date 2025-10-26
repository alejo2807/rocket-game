module org.example.game1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.game1 to javafx.fxml;
    exports org.example.game1;
}