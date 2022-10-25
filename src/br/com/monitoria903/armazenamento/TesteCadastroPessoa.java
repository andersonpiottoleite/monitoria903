package br.com.monitoria903.armazenamento;

public class TesteCadastroPessoa {

    public static void main(String[] args) {

        String[] nomes = {"Saulo", "Ana", "Mariana", "Anderson", "José",
                "Vitor", "Patricia", "Hosé", "Benjamim", "Isabela"};

        BancoDeDadosPessoa bancoDeDados = new BancoDeDadosPessoa();
        for (int i = 0; i < 10; i++) {
            bancoDeDados.adicionarPessoa(new Pessoa(i, nomes[i]));
        }

        int quantidadeDePessoasExistentes = bancoDeDados.getQuantidadeDePessoasExistentes();
        Pessoa pessoaRetornada = bancoDeDados.buscarPessoaAleatoriamente(quantidadeDePessoasExistentes);

        System.out.println(pessoaRetornada);

    }
}
