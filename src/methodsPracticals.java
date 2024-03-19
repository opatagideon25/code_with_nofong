public class methodsPracticals {
    public static void main(String[] args) {
        int A = 25;
        int B = 20;
        int Z = 67;

        final int result = add(A, B);
        int xy = add(A, Z);
        int newResult = add(34, 98);
        System.out.println(newResult);

        System.out.println(xy);
        System.out.println(result);
        int sub = subtract(74,99);
        System.out.println(sub);
        int mult = multiply(99,98,97);
        System.out.println(mult);
    }

    public static int multiply(int x, int y, int z){
        return x*y*z;
    }
    public static int subtract(int X1, int X2){
        return X1-X2;
    }

    private static int add(int x, int y) {
        return x + y;
    }

}
