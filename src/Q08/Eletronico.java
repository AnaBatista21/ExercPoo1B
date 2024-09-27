package Q08;

public class Eletronico extends Produto{
    int garantia;

    public Eletronico(String nome,double preco, int garantia){
        super(nome, preco);
        this.garantia= garantia;
    }
    public void setGarantia(int garantia){
        this.garantia= garantia;
    }
    public int getGarantia(){
        return garantia= garantia;
    }

    @Override
    public double calcularPrecoComDesconto() {
        return preco *0.9;
    }
    public void exibirPreco(){
        System.out.println("Valor do Celular com Desconto =" +calcularPrecoComDesconto());
    }
}
