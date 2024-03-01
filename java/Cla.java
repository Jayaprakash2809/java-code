import java.io.*;
public class Cla{
    String f_name,s_name;
    int age;
    char gen;

    public StringAge(){
        String ageGroup;
        if(age < 12){
            ageGroup="child";
        }else if(age>=12 && age<18){
            ageGroup="Teenage";
        }else{
            ageGroup="Adult";
        }
        return ageGroup
    }
 public void display(){
    System.out.println("My name is %s %s. I am a %c of age %d",f_name,s_name,gen,age);
 }
}