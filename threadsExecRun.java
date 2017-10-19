import static java.lang.System.exit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


 /////@author cowcutta//////

/*
///This application illustrates the process of running an executor function while handling 
three threads in five thread pools
*/


public class threadsExecRun {
    
  
    
    public static void main (String[]args) throws InterruptedException {
        
        
                //print intialization
                //Wait 2 seconds
                //Print running
                //wait 2 seconds
                //Print Closing              
                //Wait 2 seconds
        
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=1; i<=15;i++) {
            executorService.execute(new Runnable(){
                
                @Override
                public void run() {
                     
                    try {
                    System.out.println("Initializing");                   
                    Thread.currentThread().sleep(2000);
                    System.out.println("Running");
                    Thread.currentThread().sleep(2000);
                    System.out.println("Closing");
                    Thread.currentThread().sleep(2000);
                    }catch(Exception e) {
                        e.printStackTrace();
                    }
                
            }});
        }
    }
}
               
               
  


     
          
    

          
                
    
    

 















  