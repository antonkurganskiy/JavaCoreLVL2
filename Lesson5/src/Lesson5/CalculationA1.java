package Lesson5;

public class CalculationA1 extends Thread {
    @Override
    public void run() {
        long a = System.currentTimeMillis();//test row;
        System.out.println("Thread with calculations started"); //test row;
        calculationA1(ThreadForMultipleArrays.getA1());
        System.out.println("time of working : " + (System.currentTimeMillis() - a) );//test row;
        System.out.println("Calculation is done"); //test row;
    }

    protected static float[] calculationA1(float[] a1){

        for (int i = 0; i <a1.length ; i++) {
            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return a1;
    }
// protected static float[] getCalcA1(){return calculationA1(float[] a1);}
}
