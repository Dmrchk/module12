public class Main {

        private static void oneSecondThread() throws InterruptedException {
            int i = 1;
            while(true) {
                Thread.sleep(1000);
                    System.out.println(i + " seconds passed");
                i++;
            }
        }

        public static void main(String[] args) throws InterruptedException {

            Thread fiveSecondsThread = new Thread(new FiveSecondsThread());
            fiveSecondsThread.start();
            oneSecondThread();

        }

    }

    class FiveSecondsThread implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("5 seconds passed");
            }
            }

        }
