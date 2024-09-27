package Q02;

public class Empregado {
    public String nome;
    public String sobrenome;
    public double salarioMensal;

    public Empregado(String nome,String sobrenome, double salarioMensal){
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.salarioMensal= salarioMensal;
    }
    public void setNome(String nome){
        this.nome =nome;
    }
    public String getNome(){
        return nome;
    }
    public void SetSobrenome(String sobrenome){
        this.sobrenome= sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void SetSalarioMensal(double salarioMensal){
        this.salarioMensal= salarioMensal;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }

    public double CalcSalarioAnual() {
        return salarioMensal * 12;
    }

    public void printSalarioAnual(){
        System.out.println("salário anual: " +CalcSalarioAnual());
    }
    public double CalcAdicional(){
        return CalcSalarioAnual() *0.1 +CalcSalarioAnual();
    }
    public void printAdcSalario(){
        System.out.println(nome + ": Novo salário anual com aumento de 10% = " +CalcSalarioAnual());

    }

}



