package io.github.edsoncunha.estados

import io.github.edsoncunha.NotSupportedException
import io.github.edsoncunha.entidades.Reclamacao
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EmAvaliacaoTest {
    private val reclamacao = Reclamacao("Olá, mundo feio", EmAvaliacao())

    @Test
    fun `Ao aprovar, estado muda para "Aprovado"`() {
        reclamacao.aprovar()

        assert(reclamacao.estado is Aprovado) {
            "Encontrado: ${reclamacao.estado}. Esperado: Aprovado"
        }
    }

    @Test
    fun `Ao reprovar, estado muda para "Reprovado"`() {
        reclamacao.reprovar()

        assert(reclamacao.estado is Reprovado) {
            "Encontrado: ${reclamacao.estado}. Esperado: Reprovado"
        }
    }

    @Test
    fun `Ação de editar é impedida` () {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.editar()
        }
    }

    @Test
    fun `Ação de submeter é impedida` () {
        assertThrows(NotSupportedException::class.java) {
            reclamacao.submeter()
        }
    }
}