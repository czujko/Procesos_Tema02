public class HiloRestador extends Thread {
    Contador contador;

    public HiloRestador(Contador cont) {
        this.contador = cont;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            contador.decrementa();
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Restador es: " + contador.getCont());
    }
}
