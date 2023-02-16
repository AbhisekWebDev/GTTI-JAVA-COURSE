class num {
    int a, b;

    num() {
        a = 10;
        b = 20;
    }

    num(int x, int y) {
        a = x;
        b = y;
    }

    void sum() {
        System.out.println("sum = " + (a + b));
    }
}

class prog11
{
    public static void main(String[] args)
    {
        num sum1 = new num();
        num sum2 = new num(30,40);
        sum1.sum();
        sum2.sum();
    }
}
