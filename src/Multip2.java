public class Multip2 extends Thread{
    @Override
    public void run(){
        int n2 = 2;
        for (int i = 1;i<11;i++){
            int result = n2*i;
            System.out.println("Thread #3: "+n2+" x "+i+" = "+result);
        }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }

    }
}
