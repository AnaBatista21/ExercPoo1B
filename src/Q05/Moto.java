package Q05;

public class Moto extends Veiculo{
    String tipoGuidon;

    public Moto(String marca,String modelo,int ano,String tipoGuidon){
        super(marca, modelo, ano);
        this.tipoGuidon= tipoGuidon;
    }
    public void setTipoGuidon(String tipoGuidon){
        this.tipoGuidon= tipoGuidon;
    }
    public String getTipoGuidon(){
        return tipoGuidon;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Guidon:" + tipoGuidon);
    }
}


