public class neon {
    public static void main(String[] args) {
        int n=9;
        int temp=n,val,rem,sum=0;

        while(n!=0){
            val=n*n;
            rem=temp%10;
            temp=temp/10;
            sum=rem+sum;
            break;
        }
        if(n==sum){
            System.out.println("Neon number");
        }
        else
            System.out.println("Not a neon Number");
    }
}
