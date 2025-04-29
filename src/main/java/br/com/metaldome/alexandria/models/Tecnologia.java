package br.com.metaldome.alexandria.models;

import br.com.metaldome.alexandria.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Tecnologia {
    private String versao;
    private CamadaDeAtuacao camadaDeAtuacao;
    private Linguagem linguagem;
    private FrameWork frameWork;
    private Ferramentas ferramentas;
    private AmbienteDeExecucao ambienteDeExecucao;



}
