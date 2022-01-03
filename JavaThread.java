public class JavaThread{


    synchronized static void coutNumber(){
      int sum=0;
      
        for(int i=0;i<=10;i++){
            sum=sum+i;
            System.out.println("My Thread ,This is my current thread   executiny"+Thread.currentThread() +"  Value of couter "+i);
           try{Thread.sleep(2000);}catch(Exception e){} 
           System.out.println(sum);
        }
    
        System.out.println(sum);
    }




     public static void main(String[] args) {

        

        Runnable runnable=JavaThread::coutNumber;
        Thread th1=new Thread(runnable,"test 1 thread");
        Thread th2=new Thread(runnable,"test 2 thread");

        th1.start();
        th2.start();
        
    }
}