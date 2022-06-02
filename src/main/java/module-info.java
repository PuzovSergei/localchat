module com.example.localchat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;

    opens com.example.localchat to javafx.fxml;
    exports com.example.localchat;
}