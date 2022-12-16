module com.whlsteq.whlchat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.whlsteq.whlchat to javafx.fxml;
    exports com.whlsteq.whlchat;
}