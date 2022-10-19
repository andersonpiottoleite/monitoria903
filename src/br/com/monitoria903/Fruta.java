package br.com.monitoria903;

public class Fruta {

    // atributo privado, favorece o encapsulamento
    private String cor;
    private String tipo;
    private int quantidade;

    // atributo estatico, existirá somente um valor, compartilhado entre todos os objetos que forem gerados a partir dessa classe
    private static int count;

    // set serve para setar valores
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidade(int quantidade) {
        // exemplo de regra de negócio no set
        if (quantidade < 0){
            System.out.println("Quantidade indevida - " + quantidade);
            return;
        }
        this.quantidade = quantidade;
    }

    public void setCount(int count) {
        Fruta.count = count;
    }

    // get serve para obter valores
    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        // exemplo de regra de negócio no get
        if (quantidade > 10){
            System.out.println("Esse cara come demais");
        }else {
            System.out.println("Esta com pouca fome");
        }
        return quantidade;
    }

    public static int getCount() {
        return count;
    }

    // construtor de classe (com atributos)
    public Fruta(String cor, String tipo, int quantidade) {
        this.cor = cor;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    // construtor default, esse é fornecido por padrão
    // quando declaramos um de classe, como acima, perdemos o default
    // por isso precisamos declarar ele novamente
    public Fruta() {
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", count=" + count +
                '}';
    }
}
