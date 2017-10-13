


 /////@author cowcutta//////

/*
///This application runs three threads simultaneously without the loss of 
data using a synchronized function.  The sum of the three threads will be printed
after all have run and compiled.
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
               //// counts to 5,000 //// 
                for(int i=0; i<5000; i++){
                    ////runs synchronized function//////
                    increment();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                /// counts to 5,001 ////
                for(int i=0; i<5001; i++){
                    ////runs synchronized function//////
                    increment();
                }
            }
        });
        
        Thread t3 = new Thread(new Runnable(){
            
            public void run(){
               //// counts to 5,002 //// 
                for(int i=0; i<5002; i++){
                    ////runs synchronized function//////
                    increment();
                }
            }
        });
        ////runs the three threads////
        t1.start();
        t2.start();
        t3.start();
        ////adds the results of each thread////
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is: " + count);
    }
}
