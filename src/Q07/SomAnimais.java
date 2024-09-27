package Q07;

public class SomAnimais {

    public static void main(String[] args) {
        Gato gato1= new Gato();
        gato1.setNome("Tom");
        gato1.setIdade(2);

        Cachorro cachorro1= new Cachorro();
        cachorro1.setNome("Bella");
        cachorro1.setIdade(4);

        gato1.emitirSom();
        cachorro1.emitirSom();

    }
}