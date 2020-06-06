package io.github.edsoncunha.estados

import io.github.edsoncunha.entidades.Reclamacao
import java.time.LocalDateTime

class Rascunho: EstadoReclamacao() {
    override fun editar(reclamacao: Reclamacao, novoConteudo: String) {
        reclamacao.conteudo = novoConteudo
        reclamacao.salvar()
    }

    override fun submeter(reclamacao: Reclamacao) {
        reclamacao.conteudo = reclamacao.conteudo + " (submetido em ${LocalDateTime.now()})"
        reclamacao.estado = EmAvaliacao()
        reclamacao.salvar()
    }
}