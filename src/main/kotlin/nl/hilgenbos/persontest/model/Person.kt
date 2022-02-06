package nl.hilgenbos.persontest.model

import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Person (fname: String, lName: String) {

    val firstNameProperty = SimpleStringProperty(fname)
    var firstName by firstNameProperty

    val lastNameProperty = SimpleStringProperty(lName)
    var lastName by lastNameProperty

}