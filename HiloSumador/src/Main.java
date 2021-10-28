public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(100);
        HiloSumador h1 = new HiloSumador(contador);
        HiloRestador h2 = new HiloRestador(contador);

        h1.start();
        h2.start();

        while (h1.isAlive() || h2.isAlive()) {
        }
        System.out.println("Valor final " + contador.getCont());
    }
}
