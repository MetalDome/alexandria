package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ArquiteturaDeProjeto {
    private String motivo;
    private Tipo tipo;

}
