package io.github.edsoncunha.estados

import io.github.edsoncunha.NotSupportedException
import io.github.edsoncunha.entidades.Reclamacao
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RascunhoTest {
    private val reclamacao = Reclamacao("Olá, mundo feio", Rascunho())

    @Test
    fun `Ao editar, estado deve permanecer como "Rascunho"`() {
        reclamacao.editar()

        assert(reclamacao.estado is Rascunho) {
            "Encontrado: ${reclamacao.estado}. Esperado: Rascunho"
        }
    }

    @Test
    fun `Ao submeter, estado deve mudar para "Em avaliação"`() {
        reclamacao.submeter()

        assert(reclamacao.estado is EmAvaliacao) {
            "Encontrado: ${reclamacao.estado}. Esperado: EmAvaliacao"
        }
    }

    @Test
    fun `Não pode ser possível aprovar uma reclamação em rascunho`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.aprovar()
        }
    }

    @Test
    fun `Não pode ser possível reprovar uma reclamação em rascunho`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.reprovar()
        }
    }
}