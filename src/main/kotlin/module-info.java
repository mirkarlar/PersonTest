module tournamentFx {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires tornadofx;
    requires kotlin.stdlib;
    requires kotlin.reflect;
    exports nl.hilgenbos.persontest.app to javafx.graphics, tornadofx;
    exports nl.hilgenbos.persontest.view to javafx.graphics,tornadofx;
    exports nl.hilgenbos.persontest.controller to javafx.graphics,tornadofx;
    exports nl.hilgenbos.persontest.model to kotlin.reflect, tornadofx;
    opens nl.hilgenbos.persontest.view;
}