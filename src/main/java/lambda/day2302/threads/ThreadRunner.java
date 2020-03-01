package lambda.day2302.threads;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/

class Printer1_10 implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}


public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Printer1_10());
        thread.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(700);
            System.out.println(i);
        }
    }
}
