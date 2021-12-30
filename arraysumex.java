public class arraysumex {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = new int[10];
        arr[0] = 26;
        arr[1] = 28;
        arr[2] = 07;
        arr[3] = 12;
        arr[4] = 20;
        arr[6] = 98;
        arr[7] = 14;
        arr[8] = 03;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}