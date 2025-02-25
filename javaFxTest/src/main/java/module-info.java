module org.example.connection.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.connection.javafxtest to javafx.fxml;
    exports org.example.connection.javafxtest;
}