package dev.jfredericoneto.domain.conta;

import dev.jfredericoneto.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(

        Integer numero,
        DadosCadastroCliente dadosCliente

) {
}
