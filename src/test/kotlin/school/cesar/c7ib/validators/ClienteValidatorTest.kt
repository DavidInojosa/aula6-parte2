package school.cesar.c7ib.validators

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import school.cesar.c7ib.entities.Cliente
import java.time.LocalDate

class ClienteValidatorTest {

    private val clienteValidator = ClienteValidator()
    private val cliente = Cliente(
         "123",
        "Joao",
        LocalDate.of(1975, 10, 31)
    )

    @Test
    fun abc(){
        Assertions.assertTrue(true)
    }
}