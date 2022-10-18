package br.com.monitoria903;

public class Quitanda {

    public static void main(String[] args) {

        // podemos criar um objeto a partir de um construtor de classe
        new Fruta("amarela", "nanica", -50);

        // podemos criar um objeto a partir de um construtor padrão
        Fruta banana = new Fruta();
        banana.setCor("amarela");
        banana.setTipo("prata");
        banana.setQuantidade(20);

        System.out.println(banana.getQuantidade());

        Fruta laranja = new Fruta();
        laranja.setCor("laranja");
        laranja.setTipo("Lima");
        laranja.setQuantidade(10);

        System.out.println(banana);
        System.out.println(laranja);

        // se alterar um atributo estatico, todos os objetos enxergam essa alteração
        // pois um atributo estatico pertence a classe e não aos objetos
        // ele é compartilhado entre todos os objetos
        laranja.setCount(9);

        System.out.println(banana);
        System.out.println(laranja);

        CalculadoraDeFrutas.imprimeQuantidadeTotal(banana, laranja);
    }
}
