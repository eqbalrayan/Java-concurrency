public class JavaThread{




     public static void main(String[] args) {

        Runnable runnable=()->{

            for(int i=0;i<=10;i++){

                System.out.println("Welcome  " +i);
            }

        };
        Thread th1=new Thread(runnable);

        th1.start();
        
    }
}