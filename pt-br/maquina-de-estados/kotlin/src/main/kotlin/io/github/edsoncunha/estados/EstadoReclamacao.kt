package io.github.edsoncunha.estados

import io.github.edsoncunha.NotSupportedException
import io.github.edsoncunha.entidades.Reclamacao

abstract class EstadoReclamacao {
    open fun editar(reclamacao: Reclamacao, novoConteudo: String) = acaoNaoSuportada()

    open fun submeter(reclamacao: Reclamacao) = acaoNaoSuportada()

    open fun aprovar(reclamacao: Reclamacao) = acaoNaoSuportada()

    open fun reprovar(reclamacao: Reclamacao) = acaoNaoSuportada()

    fun acaoNaoSuportada() {
        throw NotSupportedException()
    }
}