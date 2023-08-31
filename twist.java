public class twist {
    public static void main(String[] args) {
        int n = 23;
        int temp = n, rev = 0, rem, c = 0, d = 0;
        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            while (temp != 0) {
                rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;
            }
            for (int i = 1; i <= rev; i++) {
                if (rev % i == 0) {
                    d++;
                }
            }

                if (d == 2) {
                    System.out.println("Twisted prime");
                } else {
                    System.out.println("Not twisted prime");
                }
            }


        }
    }
