import java.util.Random;

public class ThreadOption2 implements Runnable{
    @Override
    public void run(){
        Random rand = new Random();
        int[] nArr = {0,0,0};
        for (int i = 0;i<3;i++) {
            int x = rand.nextInt(100);
            nArr[i] = x;
        }
        System.out.println("Thread #2 Random Array: {"+nArr[0]+","+nArr[1]+","+nArr[2]+"}");
    }
}
