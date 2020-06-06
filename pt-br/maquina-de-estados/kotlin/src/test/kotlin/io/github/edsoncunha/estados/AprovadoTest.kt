package io.github.edsoncunha.estados

import io.github.edsoncunha.NotSupportedException
import io.github.edsoncunha.entidades.Reclamacao
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail

internal class AprovadoTest {
    private val reclamacao = Reclamacao("Olá, mundo feio", Aprovado())

    @Test
    fun `Ao editar reclamação aprovada, estado deve ir para "Em Avaliação"`() {
        reclamacao.editar()

        assert(reclamacao.estado is EmAvaliacao) {
            "O estado esperado era EmAvaliacao, mas é ${reclamacao.estado}"
        }
    }

    @Test
    fun `Não é possível aprovar uma reclamação já aprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.aprovar()
        }
    }

    @Test
    fun `Não é possível reprovar uma reclamação já aprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.reprovar()
        }
    }

    @Test
    fun `Não é possível submeter uma reclamação aprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.submeter()
        }
    }
}