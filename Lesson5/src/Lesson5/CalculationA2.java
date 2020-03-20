package Lesson5;

public class CalculationA2 extends Thread{
    @Override
    public void run() {
        long a = System.currentTimeMillis();//test row;
        System.out.println("Thread with calculations started"); //test row;
        calculationA2(ThreadForMultipleArrays.getA2());
        System.out.println("time of working : " + (System.currentTimeMillis() - a) );//test row;
        System.out.println("Calculation is done"); //test row;
    }

    protected static float[] calculationA2(float[] a2){

        for (int i = 0; i <a2.length ; i++) {
            a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return a2;
    }
}
