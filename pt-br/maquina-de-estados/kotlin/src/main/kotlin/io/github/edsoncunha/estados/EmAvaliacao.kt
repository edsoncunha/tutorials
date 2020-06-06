package io.github.edsoncunha.estados

import io.github.edsoncunha.entidades.Reclamacao
import java.time.LocalDateTime

class EmAvaliacao : EstadoReclamacao() {
    override fun aprovar(reclamacao: Reclamacao) {
        reclamacao.conteudo = reclamacao.conteudo + " (aprovada em ${LocalDateTime.now()})"
        reclamacao.estado = Aprovado()
        reclamacao.salvar()
    }

    override fun reprovar(reclamacao: Reclamacao) {
        reclamacao.conteudo = reclamacao.conteudo + " (reprovada em ${LocalDateTime.now()})"
        reclamacao.estado = Reprovado()
        reclamacao.salvar()
    }
}