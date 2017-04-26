/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacp;

import java.util.Random;

public class ProbabilidadeDeVencerNaMega {

    public static String GeradorJogo() {
        int[] Jogo = new int[6];
        String jogada = "";

        for (int i = 0; i <= 5; i++) {
            Random numerosR = new Random();
            Jogo[i] = numerosR.nextInt(60);

            if (Jogo[i] == 0) {
                Jogo[i] = numerosR.nextInt(60);
            } else if (Jogo[i] == Jogo[i]) {
                Jogo[i] = numerosR.nextInt(60);
            };

            jogada += "/ " + Jogo[i] + " ";

        }
        return jogada;
    }

    public static int probabilidadePorJogo(int NumeroDeJogos) {
        int combinacoes = 50063860;
        int probabilidade = NumeroDeJogos / combinacoes;

        int porcentagemProvavel = probabilidade / 100;
        return probabilidade;
    }
    
    
    public static boolean verificaseNegativo(int NumJogos){
    if (NumJogos >= 1){
    return true;
    }
     return false;
    }

    

}
