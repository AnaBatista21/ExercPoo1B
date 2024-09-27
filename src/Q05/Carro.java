package Q05;

public class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String marca,String modelo,int ano,int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public void setNumeroDePortas(){
        this.numeroDePortas = numeroDePortas;
    }
    public int getNumeroDePortas(){
        return numeroDePortas;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Marca:" +marca);
        System.out.println("Modelo:" +modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Numero de Portas:" +numeroDePortas);
    }
}
