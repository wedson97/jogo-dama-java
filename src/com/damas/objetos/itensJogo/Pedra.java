package com.damas.objetos.itensJogo;

import com.damas.gui.CasaGUI;
import com.damas.objetos.movimentos.MovimentoPedra;
import com.damas.objetos.movimentos.MovimentoStrategy;

/**
 * Representa uma Peça do jogo.
 * Possui uma casa e um tipo associado.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 * @author José Alisson Rocha da Silva {@link jose.alisson2@academico.ufpb.br}
 */
public class Pedra implements Peca {

    protected Casa casa;
    private String tipo;
    private MovimentoStrategy movimentoStrategy;

    /**
     * @param casa Objeto Casa
     * @param tipo int tipo de peça (0 = Pedra Branca, 2 = Pedra vermelha) 
     */
    public Pedra(Casa casa, String tipo) {
        this.casa = casa;
        this.tipo = tipo;
        this.movimentoStrategy = new MovimentoPedra();
        casa.colocarPeca(this);
    }
    
    @Override
    public void mover(Casa destino) {
        if (movimentoStrategy.mover(casa, destino)) {
            casa.removerPeca();
            destino.colocarPeca(this);
            casa = destino;
        }
    }

    @Override
    public boolean isMovimentoValido(Casa destino) {
        return movimentoStrategy.mover(casa, destino);
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    
}
