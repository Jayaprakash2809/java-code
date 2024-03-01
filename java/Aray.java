import java.util.*;
public class Aray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] a = new String[7];
        System.out.println("Enter the numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.next();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
    }
}
