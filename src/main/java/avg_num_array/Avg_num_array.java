package avg_num_array;
import java.util.Scanner;

public class Avg_num_array {
    
   static void avarage (int[] a)
    {
        int [] arr=a;
         int sum =0;
        float avg;
        
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        } 
        avg=(float)sum/arr.length;
         System.out.println("avarage is : "+avg);
        
    }

    public static void main(String[] args) 
    {
      Scanner sc=new Scanner (System.in);
      
        System.out.println("Enter array's length :");
        int len =sc.nextInt();
       
       int [] array=new int [len];
        System.out.println("Enter numbers :");
        for (int i=0;i<array.length;i++)
        {
          array[i]=sc.nextInt();
          
        }
        avarage (array);
        
      }
     
        
    }

