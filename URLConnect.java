/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlconnect;


import java.net.*;
import java.io.*;

/**
 *
 * @author cowcutta
 */
public class URLConnect {

     
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
          URL aWebPage = new URL("https://www.ebay.com");
   HttpURLConnection viewPage = (HttpURLConnection) aWebPage.openConnection();
   
        try (BufferedReader obtainPage = new BufferedReader(new InputStreamReader(viewPage.getInputStream()))) {
            String httpCode;
            
            while((httpCode= obtainPage.readLine()) != null)
            {
                
                if (httpCode.isEmpty() != true) {
                    System.out.println(httpCode);
                }  else {
                    System.out.println("There is not content to show.");
                }
            }  }
             
         }
     }
    

   
   
