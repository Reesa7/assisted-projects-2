package assistedproject2;

class Multi implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
          public static void main(String args[]){  
Multi m1=new Multi();  
Thread t1 =new Thread(m1);   // Using the constructor Thread
t1.start();  
 }  
}  

