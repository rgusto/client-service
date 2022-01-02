package br.com.curso.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Cliente(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    var nome: String,
    var documento: String,
    var endereco: String
)
