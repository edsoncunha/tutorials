package io.github.edsoncunha.estados

import io.github.edsoncunha.NotSupportedException
import io.github.edsoncunha.entidades.Reclamacao
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail

internal class ReprovadoTest {
    private val reclamacao = Reclamacao("Olá, mundo feio", Reprovado())

    @Test
    fun `Ao editar reclamação reprovada, estado deve ir para "Em Avaliação"`() {
        reclamacao.editar()

        assert(reclamacao.estado is EmAvaliacao) {
            "O estado esperado era EmAvaliacao, mas é ${reclamacao.estado}"
        }
    }

    @Test
    fun `Não é possível reprovar uma reclamação já reprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.reprovar()
        }
    }

    @Test
    fun `Não é possível aprovar uma reclamação já reprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.aprovar()
        }
    }

    @Test
    fun `Não é possível submeter uma reclamação aprovada`() {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.submeter()
        }
    }
}