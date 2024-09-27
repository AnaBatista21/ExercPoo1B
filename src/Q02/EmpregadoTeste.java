package Q02;

public class EmpregadoTeste {
    public static void main(String[] args){
        Empregado Empregado1 = new Empregado("José", "costa",5000);
        Empregado Empregado2 = new Empregado("Maria","silva",6000);

        Empregado1.CalcSalarioAnual();
        Empregado1.CalcAdicional();
        Empregado1.printSalarioAnual();
        Empregado1.printAdcSalario();

        Empregado2.CalcSalarioAnual();
        Empregado2.CalcAdicional();
        Empregado2.printSalarioAnual();
        Empregado2.printAdcSalario();


    }

}



