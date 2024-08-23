package com.damas.objetos.itensJogo;
import com.damas.objetos.itensJogo.Pedra;
import com.damas.objetos.movimentos.MovimentoDama;
import com.damas.objetos.movimentos.MovimentoStrategy;;
/**
 * Dama do jogo.
 * <p>Recebe uma casa e um tipo associado</p>
 * @author João Victor da S. Cirilo {@link joao.cirilo@academico.ufpb.br}
 */
public class Dama extends Pedra{

    /**
     * @param casa Objeto Casa
     * @param tipo int tipo de peça (1 = Dama Branca, 3 = Dama vermelha) 
     */
    private MovimentoStrategy movimentoStrategy;

    public Dama(Casa casa, String tipo) {
        super(casa, tipo);
        this.movimentoStrategy = new MovimentoDama();
    }

    /**
     * Movimento da Dama que pode andar várias casas na diagonal
     * @param destino
     * @return boolean. True se puder ser movida e false se não 
     */

   @Override
    public boolean isMovimentoValido(Casa destino) {
        return movimentoStrategy.mover(casa, destino);
    }
}
