package workshop.multithead;

public class Thread4 implements Runnable{


    @Override
    public void run() {
     for(int i=9;i>=0;i--){
         System.out.println("thread4:"+i);
     }
    }
}
