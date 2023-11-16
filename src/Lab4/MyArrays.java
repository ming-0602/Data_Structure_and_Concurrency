package Lab4;

public class MyArrays {

    public static int sum(int[] values){
        return sumHelper(values, 0);
    }

    private static int sumHelper(int[] values, int index){
        if (index == values.length -1){
            return values[index];
        }else {
            return values[index] + sumHelper(values, index + 1);
        }

    }

    public static void main(String[] args) {
        int[] sum = new int[2];
        sum[1] = 1;
        sum[0] = 2;
        System.out.println(sum(sum));
    }

}
