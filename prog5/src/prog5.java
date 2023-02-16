public class prog5 {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 1;
        if(a>b && a>c)
            System.out.println("largest value " + a);
        else if(b>a && b>c)
            System.out.println("largest value " + b);
        else
            System.out.println("largest value " + c);
    }
}
