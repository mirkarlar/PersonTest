package nl.hilgenbos.persontest.app

import javafx.stage.Stage
import nl.hilgenbos.persontest.view.PersonWorkspace
import tornadofx.*

class MyApp : App(PersonWorkspace::class, Styles::class) {

    override fun start(stage: Stage) {
        with(stage) {
            width = 1200.0
            height = 600.0

        }
        super.start(stage)
    }
}