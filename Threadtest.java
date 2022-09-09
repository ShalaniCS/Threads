public class Threadtest implements Runnable{

    String threadName;
    Thread thread;

    public Threadtest(String threadName){

        this.threadName = threadName;
        thread = new Thread(this, threadName);

        System.out.println("New Thread : " + thread);
        thread.start();
        System.out.println("================");

    }

    public void run(){
        
        try{

            for(int i=0; i<5; i++){
                System.out.println(threadName +  '-' + i);
                Thread.sleep(1000);
            }

        }

        catch(InterruptedException e){ 
            System.out.println(threadName + " Interrupted");
        }

        System.out.println(threadName + " Exitting");

    }

}