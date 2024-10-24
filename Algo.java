import java.util.Scanner;

public class Algo {
     // KADANES Algorithm subarray sum

  public static void kadanes(int number[]) {

    int ms = Integer.MIN_VALUE;// maximum sum
    int cs = 0;// current sum

    for (int i = 0; i < number.length; i++) {

      cs = cs + number[i];

      if (cs < 0) {// - ho to convert 0

        cs = 0;
      }

      ms = Math.max(cs, ms);
    }

    System.out.println("Our max subarray sum is = : " + ms);

  }

  public static int BuyAndSell(int price[]) {

    int buyprice = Integer.MAX_VALUE;

    int max_profit = 0;

    for (int i = 0; i < price.length; i++) {

      if (buyprice < price[i]) {

        int profit = price[i] - buyprice;

        max_profit = Math.max(max_profit, profit);
      } else {
        buyprice = price[i];
      }
    }

    return maxprofit;
}
 // Method to count total negative numbers in the given array.
    public static void countTotalNegNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int Count = 0;
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                Count = Count + 1;
            }
        } 
        
        System.out.println("Total Negative Number : " + Count );
    }

    public static void subArray(int number[]) {

        for (int i = 0; i < number.length; i++) {
          int start = i;
    
          for (int j = i + 1; j < number.length; j++) {
            int end = j;
    
            for (int k = start; k <= end; k++) {
              System.out.print(number[k] + " ");
            }
            System.out.println();
          }
          System.out.println();
        }
      }

      public static void reversearray(int number[]) {

        int first = 0, last = number.length - 1;
    
        while (first < last) {
    
          // swap
          int temp = number[last];
          number[last] = number[first];
          number[first] = temp;
    
          first++;
          last--;
        }
      }

 public static void findMax(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        int max = arr[0];
        for(int i=0;i<n;i++){
            for(int j = i+1 ;j<n ;j++){
                if(arr[j] > arr[i]){
                    max = arr[j];
                }
            }
        }
        System.out.println("greatest element in array: " + max );
    }

    public static void rightTriangle(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
       }
    
    
       public static void parallelogram(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            int c = n;
           for(int i=0;i<n;i++){
              for(int j=0;j<c-1;j++){
                System.out.print(" ");
              }
                 c= c-1;
            for(int k=0;k<n;k++){
                System.out.print("*");
            }
            
            System.out.println();
           }
        }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        int count = 0;
        for(int i =0;i<n/2;i++){
            if(arr[i] != arr[n-i-1]){
                count = 1;
                break;
            }
        }
        if(count == 1){
            System.out.println("Array is not a palindrome");
        }
        else{
            System.out.println("Array is a palindrome");
        }
   
   }
}
