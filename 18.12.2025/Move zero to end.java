brout force
public class Main
{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int size = arr.length;//1-5
        int[] temp = new int[size];
        int index = 0;
        for(int i = 0; i < size ; i++){
            if(arr[i] != 0){
              temp[index] = arr[i]; 
              index++;
            }   
        }
        for(int n : temp){
           System.out.print(n+" ");
        }
    }
}

Better
  public class Main
{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int size = arr.length;//1-5
        int z=0;
        for(int i = 0 ; i < size ; i++){
            if(arr[i] != 0){
                arr[z] = arr[i];
                System.out.print(arr[z] + " ");
                z++;
            }

        }
        for(int i = z ; i < size ; i++){
            arr[z] = 0;
            System.out.print(arr[z] + " ");
        }
       
       
    }
}

optimiser
  public class Main
{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int size = arr.length;//1-5
        int z=1 ,i = 0;
        while(z<size){
           if(arr[i] == 0){
               if(arr[z] != 0){
                   int tem = arr[i];
                   arr[i] = arr[z];
                   arr[z] = tem;
                   i++;
                   z++;
               }
               else{
                   z++;
               }
               
           }
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
       
    }}



output
  0 1 0 3 12
  1 3 12 0 0 
  
