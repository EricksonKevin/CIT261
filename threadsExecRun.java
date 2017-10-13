


 /////@author cowcutta//////

/*
///This application runs two threads simultaneously without the loss of 
data using a synchronized function.  The sum of the two threads will be printed
after both have run and compiled.
*/



 
public class threadsExecRun {
    
    private int count = 0;
    
    ///avoids loss of counts while threads running////
    public synchronized void increment() {
      count++;  
    }
    
    public static void main(String[] args) {
       threadsExecRun sample = new threadsExecRun();
       sample.doWork();
        
    }
    
    public void doWork(){
        Thread t1 = new Thread(new Runnable(){
            
            public void run(){
               //// counts to 10,000 //// 
                for(int i=0; i<10000; i++){
                    ////runs synchronized function//////
                    increment();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                /// counts to 10,000 ////
                for(int i=0; i<10000; i++){
                    ////runs synchronized function//////
                    increment();
                }
            }
        });
        ////runs both threads////
        t1.start();
        t2.start();
        
        ////adds the results of both threads////
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is: " + count);
    }
}
