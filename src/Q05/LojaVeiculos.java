package Q05;

public class LojaVeiculos {

    public static void main(String[] args){
      Carro carro1= new Carro("honda","civic",2024,4);
      Moto moto1= new Moto("honda","Cb twister",2024,"Oxxy");

      carro1.exibirDetalhes();

      moto1.exibirDetalhes();
    }
}
