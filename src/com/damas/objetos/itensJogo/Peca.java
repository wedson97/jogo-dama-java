package com.damas.objetos.itensJogo;


// simples e específica para o que uma peça de jogo deve fazer, sem métodos desnecessários.



/**
 * Interface com os métodos abstratos das peças
 * @author João Victor da S. Cirilo {@link joao.cirilo@academico.ufpb.br}
 */
public interface Peca {
    
    public static final String PEDRA_BRANCA = "PEDRA_BRANCA";
    public static final String DAMA_BRANCA = "DAMA_BRANCA";
    public static final String PEDRA_VERMELHA = "PEDRA_VERMELHA";
    public static final String DAMA_VERMELHA = "DAMA_VERMELHA";

    public void mover(Casa destino);

    public boolean isMovimentoValido(Casa destino);

    public String getTipo();
}
