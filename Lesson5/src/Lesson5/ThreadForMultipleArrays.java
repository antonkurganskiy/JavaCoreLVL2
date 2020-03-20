package Lesson5;
import static Lesson5.Main.arr;
import static Lesson5.Main.h;
public class ThreadForMultipleArrays extends Thread {
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];
    @Override
    public void run() {

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println("time of split : " + (System.currentTimeMillis() - a) );
        a = System.currentTimeMillis();
        new CalculationA1().run();
        new CalculationA2().run();
        System.out.println("time of split : " + (System.currentTimeMillis() - a) );
        a = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("time of stitching : " + (System.currentTimeMillis() - a) );
        System.out.println("Second Thread is working"); //test row;


    }
    protected static float[] getA1(){return a1;}
    protected static float[] getA2(){return a2;}
}
