public class Contador {
    int cont;

    public Contador(int num) {
        this.cont=num;
    }

    public void incrementa() {
        cont++;
    }

    public void decrementa() {
        cont--;
    }

    public int getCont() {
        return cont;
    }
}
