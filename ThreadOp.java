public class ThreadOp implements Runnable{

    public void run(){

        for(int i=0;i<=10;i++){
            System.out.println("My Thread one task"+Thread.currentThread());
        }

        

    }
    public static void main(String[] args) {

        System.out.println("My Programm start"+
        Thread.currentThread().getName()+" :id-> "+Thread.currentThread().getId());

        ThreadGroup tg1=new ThreadGroup("Group-A");
        ThreadGroup tg2=new ThreadGroup("Group-B");
        
        ThreadOp op1 =new ThreadOp();
        ThreadOp op2 =new ThreadOp();

        Thread th1=new Thread(tg1,op1,"Thread 1");
        Thread th2=new Thread(tg2,op1,"Thread 2");
        Thread th3=new Thread(tg1,op2,"Thread 3");
        Thread th4=new Thread(tg2,op2,"Thread 4");
        
        System.out.println("Group name :"+th1.getThreadGroup()+"  Thread Name :"+th1.getName());
        System.out.println("Group name :"+th2.getThreadGroup()+"  Thread Name :"+th2.getName());
        System.out.println("Group name :"+th3.getThreadGroup()+"  Thread Name :"+th3.getName());
        System.out.println("Group name :"+th4.getThreadGroup()+"  Thread Name :"+th4.getName());
       
        System.out.println("thread name:"+th1.getName());
        System.out.println( "thread id:"+th1.getId());

        th1.start();
       try{ 
           Thread.sleep(3000);
        }catch(Exception e){};

        System.out.println("My Programm end Thread name: "+Thread.currentThread().getName()+" :id-> "+Thread.currentThread().getId());
    }
    
}
