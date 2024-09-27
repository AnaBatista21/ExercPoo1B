package Q08;

import Q05.Veiculo;

public abstract class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome= nome;
        this.preco=preco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome= nome;
    }
    public void setPreco(double preco){
        this.preco= preco;
    }
    public double getPreco(){
        return preco= preco;
    }

    public double calcularPrecoComDesconto(){
        return preco;
    }
    public void exibirPreco(){
        System.out.println(calcularPrecoComDesconto());
    }
}
