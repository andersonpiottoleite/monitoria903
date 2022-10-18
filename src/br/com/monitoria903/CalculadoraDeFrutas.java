package br.com.monitoria903;

public class CalculadoraDeFrutas {

    // metodo estatico, já que ele não depende de instancias dessa classe CalculadoraDeFrutas
    // faz sentido o metodo ser estatico
    public static void imprimeQuantidadeTotal(Fruta... frutas){
        int quantidadeTotal = 0;

        for (int i = 0; i < frutas.length; i++) {
            quantidadeTotal = (quantidadeTotal + frutas[i].getQuantidade());
        }

        System.out.println(quantidadeTotal);
    }
}
