package io.github.edsoncunha.estados

import io.github.edsoncunha.entidades.Reclamacao
import java.time.LocalDateTime

class Reprovado : EstadoReclamacao() {
    override fun editar(reclamacao: Reclamacao, novoConteudo: String) {
        reclamacao.conteudo = novoConteudo
        reclamacao.estado = EmAvaliacao()

        reclamacao.salvar()
    }
}