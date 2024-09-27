package Q08;

public class Alimento extends Produto{
    String dataValidade;

    public Alimento(String nome,double preco,String dataValidade){
        super(nome, preco);
        this.dataValidade= dataValidade;
    }
    public void setDataValidade(String dataValidade){
        this.dataValidade= dataValidade;
    }
    public String getDataValidade(){
        return dataValidade;
    }

    @Override
    public double calcularPrecoComDesconto() {
        return preco;
    }

    @Override
    public void exibirPreco() {
        System.out.println("valor do Arroz=" +calcularPrecoComDesconto());
    }
}
