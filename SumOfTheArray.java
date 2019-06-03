package Curs18.SumOfTheArray;

public class SumOfTheArray {

    public static void main(String[] args) {
        int[] x = {2, 4, 5, 7, 4, 10};
        int sum = 0;

        for (int i = 0; i < x.length ; i++)
            sum += x[i];

        System.out.println(sum);


//        System.out.println(x);
//        for (int i : x) {
//            System.out.println(i + "");
    }


}

