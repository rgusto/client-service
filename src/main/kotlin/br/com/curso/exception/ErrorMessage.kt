package br.com.curso.exception

import java.time.LocalDateTime

data class ErrorMessage(
    val dataHora: String = LocalDateTime.now().toString(),
    val msg: String?
)