package Lesson19;


public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t3.start();
        t2.start();
        t1.start();

/*

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

  /*      t1.start();*/





        System.out.println("All Thread done, program ending! ");
    }

}


