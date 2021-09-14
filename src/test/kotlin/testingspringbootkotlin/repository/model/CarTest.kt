package testingspringbootkotlin.repository.model

import mvc.service.Car
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CarTest {

    @Test
    fun `should fix the car`() {
        val car = Car() //we create the object to test

        car.fix() //we run the method to test

        assertEquals("fixed", car.state) //we check if the result is correct
    }
}
