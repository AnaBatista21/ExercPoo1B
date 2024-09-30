package Q04;

public class InteiroSet {

    private boolean[] array;

    public InteiroSet() {
        array = new boolean[101];
    }
    public void insereElemento(int k){
        if(k >= 0 && k <= 100){
            array[k] = true;
        }
    }
    public void deleteElemento(int k){
        if(k >= 0 && k <= 100){
            array[k] = false;
        }
    }
    public InteiroSet union(InteiroSet outroArray){
        InteiroSet conjunto = new InteiroSet();
        for (int i = 0; i <= 100; i++){
            conjunto.array[i] = array[i] || outroArray.array[i];
        }
        return conjunto;
    }
    public InteiroSet intersecao(InteiroSet outroConjunto){
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++){
            resultado.array[i] = this.array[i] && outroConjunto.array[i];
        }
        return resultado;
    }
    public String toSetString(){
        StringBuilder sb = new StringBuilder();
             boolean vazio = true;

             for (int i = 0; i <= 100; i++){
                 if (array[i]) {
                     if (!vazio) {
                         sb.append(" ");
                     }
                     sb.append(i);
                     vazio = false;
                 }
             }
             return vazio ? "-" : sb.toString();
    }
    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i<= 100; i++){
            if (this.array[i] != outroConjunto.array[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean[] getArray(){
        return array;
    }
    public void setArray(boolean[] array){
        this.array = array;
    }
}

