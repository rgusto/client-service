package br.com.curso.service

import br.com.curso.exception.RegistroNaoEncontradoException
import br.com.curso.model.Cliente
import br.com.curso.repository.ClienteRepository
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class ClienteService(
    private val clienteRepository: ClienteRepository
) {

    fun create(cliente: Cliente): Cliente {
        return clienteRepository.save(cliente)
    }

    fun findAll(nome: String?, pageable: Pageable): Page<Cliente> {
        var clientes = if (nome == null) {
            clienteRepository.findAll(pageable)
        } else {
            clienteRepository.findByNome(nome, pageable)
        }
        return clientes
    }

    fun findById(id: Long): Cliente {
        return clienteRepository.findById(id).orElseThrow {
            RegistroNaoEncontradoException("Registro não encontrado")
        }
    }

    fun delete(id: Long) {
        val clienteDb = findById(id)
        return clienteRepository.delete(clienteDb)
    }

    @Transactional
    open fun update(id: Long, cliente: Cliente) {
        val clienteDb = findById(id)
        clienteDb.nome = cliente.nome
        clienteDb.documento = cliente.documento
        clienteDb.endereco = cliente.endereco
        clienteRepository.save(clienteDb)
    }

    fun listar(nome: String?): List<Cliente> {
        return clienteRepository.listarComImplementacao(nome)
    }


}