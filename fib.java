public class fib {
    public static void main(String[] args) {
        int f=0;
        int s=1;
        for(int i=0;i<10;i++){
            System.out.print(f+" ");
            int p=f+s;
            f=s;
            s=p;
        }
    }
}
