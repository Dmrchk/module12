public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            MultithreadA threadA = new MultithreadA();
            threadA.number(i);
        }
    }
}
