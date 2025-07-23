import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The sorted array : "+Arrays.toString(arr));
        System.out.println();
        int na=sc.nextInt();
        sc.nextLine();
        String[] str=new String[na];
        for(int i=0;i<na;i++){
            str[i]=sc.nextLine();
        }
        Arrays.sort(str);
        System.out.print("The sorted String : "+Arrays.toString(str));
    }
}
