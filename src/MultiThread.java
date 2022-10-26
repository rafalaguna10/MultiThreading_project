import java.util.Random;
public class MultiThread extends Thread{
    @Override
    public void run(){
        Random rand = new Random();
        int[] nArr = {0,0,0};
        for (int i = 0;i<3;i++) {
            int x = rand.nextInt(150);
            nArr[i] = x;
        }
        System.out.println("Thread #1 Random Array: {"+nArr[0]+","+nArr[1]+","+nArr[2]+"}");
    }
}
