module appli {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires spring.security.crypto;

    opens appli.acceuil to javafx.fxml;
    exports appli;
    opens appli to javafx.fxml;
    exports appli.acceuil;
    exports Liste;
    opens Liste to javafx.fxml;
}