package Lesson19;

class MyRunnable implements Runnable{

    @Override
    public void run() {


        System.out.println("Thread done:::" + Thread.currentThread().getName());
    }

}

