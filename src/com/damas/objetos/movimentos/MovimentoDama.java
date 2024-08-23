package com.damas.objetos.movimentos;

import com.damas.objetos.itensJogo.Casa;

public class MovimentoDama implements MovimentoStrategy {

    @Override
    public boolean mover(Casa origem, Casa destino) {
        // Movimento válido se a peça se mover diagonalmente
        int distanciaX = Math.abs((destino.getX() - origem.getX()));
        int distanciaY = Math.abs((destino.getY() - origem.getY()));

        if (distanciaX == distanciaY) return true;

        return false;
    }
}
