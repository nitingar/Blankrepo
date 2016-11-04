
public class LambdaThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": RunnableTest");
 
        // Anonymous Runnable
 
        Runnable task1 = new Runnable(){
 
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName() + " is running Anonymous");
          }
        };
 
 Thread chil = new Thread(task1,"chil");
 chil.start();
       
 Runnable r2 =() -> System.out.println(Thread.currentThread().getName());
 Thread chil2 = new Thread(r2,"chil2");
 chil.start();
        // Lambda Runnable
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running Lambda");
        };
 
        Thread thread1 = new Thread(task1);
 
       // thread1.start();
       
 
        new Thread(task3).start();
 
    }
}