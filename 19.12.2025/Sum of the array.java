import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int k = 0;
        for(int i = 0 ; i < num ; i++){
              arr[i] = sc.nextInt();
            }
        for(int j = 0; j< num ; j++){
                 k+=arr[j];
                
            }
        System.out.print(k);
    }
}
