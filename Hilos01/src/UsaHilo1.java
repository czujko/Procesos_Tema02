public class UsaHilo1 {
    public static void main(String[] args) {
        Hilo1[] hilos = new Hilo1[5];
        for (int n = 0; n < 5; n++) {
            hilos[n] = new Hilo1("Hilo" + n);
            if (n < 3) {
                hilos[n].setPriority(Thread.MIN_PRIORITY);
            } else {
                hilos[n].setPriority(Thread.MAX_PRIORITY);
            }
            hilos[n].start();
        }
        for (int n = 0; n < 5; n++) {
            System.out.println("Estado desde UsaHilo1:" + hilos[n].getState());
        }
    }
}
