package br.com.monitoria903.armazenamento;

import java.util.Random;

public class BancoDeDadosPessoa {

    private static Pessoa[] bancoPessoas  = new Pessoa[10];

    public void adicionarPessoa(Pessoa pessoa){
        for (int i = 0; i < bancoPessoas.length; i++) {
            if (bancoPessoas[i] == null){
                bancoPessoas[i] = pessoa;
                break;
            }
        }
    }

    public int getQuantidadeDePessoasExistentes(){
        int countPessoasExistentes = 0;
        for (int i = 0; i < bancoPessoas.length; i++) {
            if (bancoPessoas[i] != null){
                countPessoasExistentes ++;
            }
        }
        return countPessoasExistentes;
    }

    public Pessoa buscarPessoaAleatoriamente(int quantidadeDePessoasExistentes) {
        int posicaoAleatoria = new Random().nextInt(quantidadeDePessoasExistentes);
        Pessoa pessoaAleatoria = bancoPessoas[posicaoAleatoria];
        return pessoaAleatoria;
    }
}
