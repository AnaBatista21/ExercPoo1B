package Q07;

public abstract class Animal {
    String nome;
    int idade;

    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome= nome;
    }
    public void setIdade(int idade){
        this.idade= idade;
    }
    public int getIdade(){
        return idade;
    }

    public void emitirSom(){
        System.out.println();
    }
}
