import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be search : ");
        int number=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==number){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(number+" is found in the array");
        }
        else{
            System.out.println(number+" is not found in the array");
        }
    }
}
