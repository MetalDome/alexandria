package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.StatusAtual;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformacoesBasicas {

    private String nome;
    private String cliente;
    private String autorPrincipal;
    private String motivoDoProjeto;
    private StatusAtual statusAtual; // Enum StatusAtual
    private String linkDoRepositorio;
    private String dificuldadeTecnicas;

}
