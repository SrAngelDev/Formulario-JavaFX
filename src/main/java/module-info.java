module srangeldev.formulariofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens srangeldev.formulariofx to javafx.fxml;
    exports srangeldev.formulariofx;
}