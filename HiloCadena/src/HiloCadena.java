public class HiloCadena extends Thread{
    String str;
    public HiloCadena(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        super.run();

        for(int i = 0; i<str.length(); i++) {
            System.out.println(str.substring(i,i+1));
        }

        String[] cadenaStr = str.split("");
        for(int i = 0; i<cadenaStr.length;i++){
            System.out.println(cadenaStr[i]);
        }
    }
}
