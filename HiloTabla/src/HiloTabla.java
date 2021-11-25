public class HiloTabla extends Thread {
    int num;

    public HiloTabla(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
