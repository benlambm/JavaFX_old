module edu.vwcc.gui {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.vwcc.gui to javafx.fxml;
    exports edu.vwcc.gui;
}