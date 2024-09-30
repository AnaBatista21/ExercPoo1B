package Q04;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        InteiroSet C = new InteiroSet();
        C.insereElemento(10);

        InteiroSet c2 = new InteiroSet();
        c2.insereElemento(10);
        c2.insereElemento(20);

        InteiroSet union = C.union(c2);

        InteiroSet inter = C.intersecao(c2);

        System.out.println(union.toSetString());
    }
}
