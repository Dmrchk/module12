public class MultithreadA extends Thread{
    public boolean fizz(int i){
        if (i % 3 == 0){
            System.out.println("fizz");
            return true;
        }
        return false;
    }
    public boolean buzz(int i){
        if (i % 5 == 0){
            System.out.println("buzz");
            return true;
        }
        return false;
    }
    public boolean fizzBuzz(int i){
        if (i % 3 == 0 && i % 5 == 0){
            System.out.println("fizzBuzz");
            return true;
        }
        return false;
    }
    public void number(int i){
        MultithreadA thread0 = new MultithreadA();
        if (i == 0){
            System.out.println(i);
        }
        if (i != 0 && !thread0.fizzBuzz(i) && !thread0.buzz(i) && !thread0.fizz(i)){
            System.out.println(i);
        }
    }
}
