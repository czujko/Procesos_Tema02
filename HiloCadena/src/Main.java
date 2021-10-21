public class Main {
    public static void main(String[] args) {
        HiloCadena hilo = new HiloCadena("pera");
        HiloCadena hilo2 = new HiloCadena("manzana");
        HiloCadena hilo3 = new HiloCadena("melocotón");

        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
