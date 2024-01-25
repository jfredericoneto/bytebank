package dev.jfredericoneto.bytebank.domain.conta;

import dev.jfredericoneto.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(

                Integer numero,
                DadosCadastroCliente dadosCliente

) {
}
