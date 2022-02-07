package nl.hilgenbos.persontest.model

import tornadofx.*

class PersonModel()  : ItemViewModel<Person>() {

    val firstName = bind(Person::firstNameProperty)
    val lastName = bind(Person::lastNameProperty)
}