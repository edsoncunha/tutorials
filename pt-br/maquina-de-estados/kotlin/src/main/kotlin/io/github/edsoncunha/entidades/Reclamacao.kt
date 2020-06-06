package io.github.edsoncunha.entidades

import io.github.edsoncunha.estados.EstadoReclamacao
import io.github.edsoncunha.estados.Rascunho

class Reclamacao(var conteudo: String, internal var estado: EstadoReclamacao = Rascunho()) {
    fun editar(novoConteudo: String) = estado.editar(this, novoConteudo)

    fun submeter() = estado.submeter(this)

    fun aprovar() = estado.aprovar(this)

    fun reprovar() = estado.reprovar(this)

    fun salvar() {
        println("Conteúdo: $conteudo")
    }
}