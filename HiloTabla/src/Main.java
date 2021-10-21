public class Main {
    public static void main(String[] args) {
        int num;

        for(int i= 0; i<11;i++){
            HiloTabla hilo = new HiloTabla(i);
            hilo.start();
        }

        /*HiloTabla hilo = new HiloTabla(2);
        HiloTabla hilo2 = new HiloTabla(5);
        HiloTabla hilo3 = new HiloTabla(1);
        hilo.start();
        hilo2.start();
        hilo3.start();*/
    }
}
