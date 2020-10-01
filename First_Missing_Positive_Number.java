import java.util.Arrays;
import java.util.Scanner;

public class First_Missing_Positive_Number {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int []Arr= new int[N];
        for( int i=0;i<N;i++)
            Arr[i]=sc.nextInt();
        System.out.println(firstMissingPositive(Arr));




    }
    static int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int  i=0;
        while(i<n){
            if(nums[i]>0&&nums[i]<=n&&nums[nums[i]-1]!=nums[i]){
                swap(i,nums[i]-1,nums)  ;
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(nums));

        for(  i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }


        return n+1;

    }
    static void swap(int x,int y,int[]A){
        int  t=A[x];
        A[x]=A[y];
        A[y]=t;
    }
}
