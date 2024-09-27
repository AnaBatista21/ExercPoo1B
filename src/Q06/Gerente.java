package Q06;

public class Gerente extends Funcionario {

    double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }


}