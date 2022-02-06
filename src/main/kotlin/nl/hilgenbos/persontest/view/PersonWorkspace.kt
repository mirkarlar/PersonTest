package nl.hilgenbos.persontest.view

import javafx.application.Platform
import javafx.scene.control.TabPane
import tornadofx.*

class PersonWorkspace : Workspace("Person Workspace", NavigationMode.Tabs) {

    init {

        createMenu()

        dock<PersonView>()

        tabContainer.tabClosingPolicy = TabPane.TabClosingPolicy.UNAVAILABLE
    }

    private fun createMenu() {
        menubar {
            menu("File") {

                item("Exit").action {
                    log.info("Leaving workspace")
                    Platform.exit()
                }
            }
            menu("Help") {
                item("About...")
            }


        }
    }
}

