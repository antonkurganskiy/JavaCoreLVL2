package Lesson5;

import static Lesson5.Main.arr;

public class ThreadForOneArray extends  Thread{
    @Override
    public void run() {
        long a = System.currentTimeMillis();
        Main.MathChanger(arr);
        System.out.println("time of working : " + (System.currentTimeMillis() - a) );
        System.out.println("Thread is working"); // test row;
    }
}
