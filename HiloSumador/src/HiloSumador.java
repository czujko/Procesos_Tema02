public class HiloSumador extends Thread {
    Contador contador;
    public HiloSumador(Contador cont) {
        this.contador = cont;
    }

    @Override
    public void run() {
        for (int i=0;i<300;i++){
            contador.incrementa();
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sumador es: " + contador.getCont());
    }
}
