package nl.hilgenbos.persontest.view

import javafx.geometry.Pos
import nl.hilgenbos.persontest.controller.PersonController
import nl.hilgenbos.persontest.model.Person
import nl.hilgenbos.persontest.model.PersonModel
import tornadofx.*

class PersonView : View("Person View") {

    private val model: PersonModel by inject()
    private val controller: PersonController by inject()


    override val root = borderpane {
        center = vbox {
            alignment = Pos.CENTER
            paddingBottom = 20.0
            paddingLeft = 20.0
            paddingRight = 20.0

            form {
                fieldset {
                    tableview(controller.listOfPeople) {
                        column("First Name", Person::firstName)
                        column("Last Name", Person::lastName)
                        bindSelected(model)
                    }
                }
                fieldset {
                    field("First Name") {
                        maxWidth = 220.0
                        textfield(model.firstName) {
                            this.required()
                            validator {
                                when {
                                    it.isNullOrEmpty() -> error("Field cannot be empty")
                                    it.length < 3 -> error("Too short")
                                    else -> null
                                }
                            }
                        }
                    }
                    field("Last Name") {
                        maxWidth = 220.0
                        textfield(model.lastName) {
                            this.required()
                            validator {
                                when {
                                    it.isNullOrEmpty() -> error("Field cannot be empty")
                                    it.length < 3 -> error("Too short")
                                    else -> null
                                }
                            }
                        }
                    }
                    button("AddItem") {
                        enableWhen(model.valid)
                        action {
                            model.commit()
                            controller.addPerson(model.firstName.value, model.lastName.value)
                            model.rollback() // reset form
                        }
                    }
                }
            }
        }
    }
}
