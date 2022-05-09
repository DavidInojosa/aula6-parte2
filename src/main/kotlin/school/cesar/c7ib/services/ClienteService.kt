package school.cesar.c7ib.services

import school.cesar.c7ib.entities.Cliente
import school.cesar.c7ib.respositories.ClienteRepository
import school.cesar.c7ib.validators.ClienteValidator
import javax.management.loading.ClassLoaderRepository

class ClienteService(
    private val clienteValidator: ClienteValidator,
    private val clientRepository: ClienteRepository
) {

    fun add(cliente: Cliente) {
        clienteValidator.valida(cliente)
        clientRepository.add(cliente)
    }

    fun buscar(cpf: String) =
        clientRepository.buscar(cpf)

    fun all() =
        clientRepository.all()
}
