package nl.hilgenbos.persontest.controller

import javafx.collections.ObservableList
import nl.hilgenbos.persontest.model.Person
import tornadofx.*

class PersonController : Controller() {

   var listOfPeople: ObservableList<Person>

   init {
       listOfPeople = mutableListOf (
           Person("John", "Doe"),
           Person("Jane", "Doe"),
           Person("Tarzan", "Grey")
       ).asObservable()
   }


    fun addPerson(firstName : String, lastName : String) {
        val p  = Person(firstName, lastName)
        this.listOfPeople.add(p)
    }
}