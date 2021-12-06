package Lesson_3;

import java.util.Arrays;

public class Main {
    public static void myArray(){
        String[] arr = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(arr));
        changeItem(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void changeItem(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {


        Box<Apple> appleBox1 = new Box<>();
        appleBox1.name =" Apple box 1 ";
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.name =" Orange box 1 ";
        Box<Apple> appleBoxIn = new Box<>();
        appleBoxIn.name =" Apple box In ";
        Box<Orange> orangeBoxIn = new Box<>();
        orangeBoxIn.name =" Orange box In ";
        Apple[] arrapple = new Apple[6];
        Orange[] arrorange = new Orange[4];
        for(int i = 0; i<arrapple.length;i++) {
            arrapple[i] = new Apple("Apple", 1.0f) {
                @Override
                public boolean getName() {
                    return false;
                }
            };
            appleBox1.addFruit(arrapple[i]);
            System.out.print(arrapple[i].getName());
            appleBox1.getWeight();
        }

        for(int i = 0; i<arrorange.length;i++) {
            arrorange[i] = new Orange("Orange", 1.5f) {
                @Override
                public boolean getName() {
                    return false;
                }
            };
            orangeBox1.addFruit(arrorange[i]);
            System.out.print(arrorange[i].getName());
            orangeBox1.getWeight();
        }

        System.out.println(" weight one apple  "+arrapple[0].getWeight());
        System.out.println(" weight one orange  "+arrorange[0].getWeight());
        System.out.println("Compare : "+appleBox1.compare(orangeBox1)+"\n");
        System.out.println(appleBox1.getName()+"  "+appleBox1.getWeight());
        System.out.println(appleBoxIn.getName()+"  "+appleBoxIn.getWeight());

        appleBox1.outAllFruitsToBox(appleBoxIn);
        System.out.println(appleBox1.getName()+"  "+appleBox1.getWeight());
        System.out.println(appleBoxIn.getName()+"  "+appleBoxIn.getWeight());

        orangeBox1.outAllFruitsToBox(orangeBoxIn);
        System.out.println(orangeBox1.getName()+"  "+orangeBox1.getWeight());
        System.out.println(orangeBoxIn.getName()+"  "+orangeBoxIn.getWeight());

        myArray();
    }
}


