import java.util.Scanner;

public class Max1sinarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
    int max=0;
    int index=0;
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++){
            if(a[i][j]==1){
                c+=1;
            }                                           //111 010 000 maxcount=3 and at index 0
        }
        if(c>=max){
            max=c;
            index=i;
        }
    }
    System.out.println(max+" "+index);
}
}
