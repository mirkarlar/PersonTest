package nl.hilgenbos.persontest.controller

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import nl.hilgenbos.persontest.model.Person
import tornadofx.*

class PersonController : Controller() {

  public val listOfPeople: ObservableList<Person> =
      listOf (Person("John", "Doe"),
          Person("Jane", "Doe"),
          Person("Tarzan", "Grey")
      ).asObservable()



    fun addPerson(p : Person) {
        listOfPeople.add(p)
    }
}