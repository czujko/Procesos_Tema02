public class Hilo extends Thread {
    private int[] arr;
    private int suma;
    private boolean done;

    public Hilo(String nombre) {
        super(nombre);
        this.suma = 0;
        this.arr = new int[1000];
        this.done = false;
    }

    public void run() {
        super.run();
        this.setDone(false);

        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
            //System.out.println("La suma es " + suma);
        }
        this.setDone(true);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
