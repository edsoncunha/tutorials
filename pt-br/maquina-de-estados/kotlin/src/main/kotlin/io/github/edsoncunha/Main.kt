package io.github.edsoncunha

import io.github.edsoncunha.entidades.Reclamacao

fun main() {
    val reclamacao = Reclamacao("Reclamação com um palavrão")


    reclamacao.submeter()
    reclamacao.reprovar()
    reclamacao.editar("Reclamação com um pouco mais de calma")
    reclamacao.aprovar()
}