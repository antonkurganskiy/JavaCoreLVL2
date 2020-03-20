package Lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    public static float[] arr = new float[size];

    public static void main(String[] args) {
        ThreadForOneArray th1 = new ThreadForOneArray();
        ThreadForMultipleArrays th2 = new ThreadForMultipleArrays();
        long a = System.currentTimeMillis();
        filler(arr);
        System.out.println("time of working : " + (System.currentTimeMillis() - a));
        th1.run();
        th2.run();
        th1.interrupt();
        th2.interrupt();
    }

    protected static void filler(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    protected static void MathChanger(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}


