package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.SistemaGerenciadorDb;
import br.com.metaldome.alexandria.enums.TipoDb;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BancoDeDados {
    private TipoDb tipoDb;
    private SistemaGerenciadorDb sistemaGerenciadorDb;

}
