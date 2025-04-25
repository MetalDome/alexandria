package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.TipoDesign;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DesignPattern {
    private String motivo;
    private TipoDesign tipoDesign;
    private boolean possui;
}
