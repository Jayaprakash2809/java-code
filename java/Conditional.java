import java.io.*;
class Conditional
{
    public static void main(String args[]){
        int a=17,w=55;
        if (a>18){
            System.out.println("Age is above 18");
            if(w>=50){
                System.out.println("Age and Weight is satisfied . He can donate blood");
            }
            else{
                System.out.println("Weight is not satisfied");
            }
        }
        else{
            System.out.println("Age is not satisfied");
        }
    }
}