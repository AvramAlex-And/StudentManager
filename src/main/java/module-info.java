module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens loose.oose.fis.lab.student.manager.controllers to javafx.fxml;
    exports com.example.demo;
}