public class Multithread {
    
    public static void main(String[] args){

        Threadtest t1 = new Threadtest("Thread 1");
        Threadtest t2 = new Threadtest("Thread 2");
        Threadtest t3 = new Threadtest("Thread 3");

        try{
            Thread.sleep(10000);
        }

        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exitting");

    }

}
