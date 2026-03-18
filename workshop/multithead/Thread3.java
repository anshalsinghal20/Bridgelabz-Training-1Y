package workshop.multithead;

public class Thread3 extends Thread {
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("thead3:"+i);
        }
    }
    static void main(){
        Thread3 thead3=new Thread3();
        thead3.start();
        Thread4 thread4=new Thread4();
        Thread thread=new Thread(thread4);
        thread4.run();
    }
}
