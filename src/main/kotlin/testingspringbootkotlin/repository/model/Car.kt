package testingspringbootkotlin.repository.model

class Car(var state: String = "broken") {

    fun fix() {
        state = "fixed"
    }
}