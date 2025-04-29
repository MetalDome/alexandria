package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.AutenticacaoUsada;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Seguranca {

    private AutenticacaoUsada autenticacaoUsada;
    private boolean usaSeguranca;

}
