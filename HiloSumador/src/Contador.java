public class Contador {
    int cont;

    public Contador(int num) {
        this.cont=num;
    }

    public synchronized void incrementa() {
        cont++;
    }

    public synchronized void decrementa() {
        cont--;
    }

    public int getCont() {
        return cont;
    }
}
