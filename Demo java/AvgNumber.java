public class AvgNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        float[] arrayf={0.1f,0.2f,0.3f,0.4f,0.5f};
        int sum=0;
        float sum1=0;
        float avg,avg1;
        for(int i=0;i<array.length;i++) {
            sum = sum + array[i];
            sum1=sum1 +arrayf[i];
        }
        avg = (sum / 5);
        avg1 = (sum1/5);
        System.out.println(array[array.length / 2]);
        System.out.println(arrayf[arrayf.length / 2]);
        System.out.println("average is " + avg);
        System.out.println("average is " + avg1);


    }
}
