package Q06;

    public class DP{
        public static void main(String[] args) {
            Assistente assistente1= new Assistente();
            assistente1.setNome("patricia");
            assistente1.setSalarioBase(1500);

            assistente1.calcularSalario();
            assistente1.printSalario();

            Gerente gerente1= new Gerente();
            gerente1.setNome("Ana");
            gerente1.setSalarioBase(1500);
            gerente1.setBonus(4000);

            gerente1.calcularSalario();
            gerente1.printSalario();



        }
    }

