module org.apps.advancewars {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.apps.advancewars to javafx.fxml;
    exports org.apps.advancewars;
}