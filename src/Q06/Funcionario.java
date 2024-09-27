package Q06;

public abstract class Funcionario {

    public String nome;
    public double salarioBase;

    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public abstract double calcularSalario();{

    }
    public void printSalario(){
        System.out.println(nome+ " recebe:" +calcularSalario());
    }
}