public class Multip5 extends Thread{
    @Override
    public void run(){
        int n5 = 5;
        for (int i = 1;i<11;i++){
            int result = n5*i;
            System.out.println("Thread #4: "+n5+" x "+i+" = "+result);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

