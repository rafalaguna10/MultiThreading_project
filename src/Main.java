public class Main {
    public static void main(String[] args) {
        //option 1
        MultiThread thread1 = new MultiThread();

        //option 2
        ThreadOption2 my_runnable = new ThreadOption2();
        Thread thread2 = new Thread(my_runnable);

        thread1.start();
        thread2.start();

        Multip2 thread3 = new Multip2();
        Multip5 thread4 = new Multip5();

        thread3.start();
        thread4.start();
    }
}