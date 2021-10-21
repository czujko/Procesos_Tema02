public class Main {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[1000];
        arr2 = new int[1000];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
            arr2[i] = (int) (Math.random() * 100);
        }

        /*int acumulador = 0;
        for (int i = 0; i < arr1.length; i++) {
            acumulador = acumulador + arr1[i];
        }
        System.out.println("La suma es " + acumulador);*/

        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");

        hilo1.setArr(arr1);
        hilo2.setArr(arr2);
        hilo1.start();
        hilo2.start();

        /*while (hilo1.isAlive() || hilo2.isAlive()) {
        }*/

        while(!hilo1.isDone()) {
        }

        System.out.println("La suma del Array 1 es: " + hilo1.getSuma());
        System.out.println("La suma del Array 2 es: " + hilo2.getSuma());
    }
}
