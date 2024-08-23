package com.damas.objetos.movimentos;

import com.damas.objetos.itensJogo.Casa;

public interface MovimentoStrategy {
    boolean mover(Casa origem, Casa destino);
}
