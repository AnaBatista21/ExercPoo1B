package Q08;

public class Caixa {
    public static void main(String[] args){
        Eletronico eletronico1= new Eletronico("Celular",1400,12);
        Alimento alimento1= new Alimento("Arroz",5.99,"20/08/25");

        eletronico1.calcularPrecoComDesconto();
        eletronico1.exibirPreco();

        alimento1.calcularPrecoComDesconto();
        alimento1.exibirPreco();
    }
}
