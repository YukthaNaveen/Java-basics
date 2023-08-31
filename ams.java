import java.util.*;
import  java.lang.Math.*;

public class ams {
    public static void main(String[] args) {
        int n=1533;
        int temp=n;int rem,sum=0;
        while(temp!=0){
            rem=temp%10;
            sum +=Math.pow(rem,3);
            temp=temp/10;

        }
        if(n==sum){
            System.out.println("Amstrong");

        }
        else{
            System.out.println("not Amstrong" );
        }
    }
}
