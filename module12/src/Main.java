import java.util.Date;

public class Main {


    public static void main(String[] args) throws InterruptedException {

       // task1
        MultithreadClass thread = new MultithreadClass();
        int i = 0;
        thread.start();
        while (true) {
            System.out.println( i + " seconds passed T0");
            i += 1;
            Thread.sleep(1000);
            if (i == 10){
                thread.stop();
                break;
            }
        }
    }
}

