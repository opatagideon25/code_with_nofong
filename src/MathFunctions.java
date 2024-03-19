public class MathFunctions {
    public static void main(String[] args) {
        // CONSTANTS IN JAVA pi E
        System.out.println("Constants in Java");
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(2*Math.PI);
        // TRIG FUNCTIONS IN JAVA
        System.out.println("Trig Functions");
        System.out.println(Math.cos(90));//NOT RIGHT
        //CONVERTING FROM DEGREES TO RADIANS
        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.tan(Math.toRadians(90)));
        //ASSIGNMENT asin, acos, atan
        //EXPONENT FUNCTIONS
        System.out.println(Math.exp(5));//Constant E to power 5
        System.out.println(Math.log(15));//natural log of 15
        System.out.println(Math.log10(15));//log to base 10 of 15
        System.out.println(Math.pow(5,7));// 5 to power 7
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(25,1.0/7));
        //ROUNDING METHODS
        System.out.println("Rounding methods");
        System.out.println("ceil: "+ Math.ceil(89.7952));
        System.out.println("ceil: "+ Math.ceil(89.1952));
        System.out.println("floor: "+ Math.floor(89.7952));
        System.out.println("floor: "+ Math.floor(89.1952));
        System.out.println("rint: "+ Math.rint(89.7952));
        System.out.println("rint: "+ Math.rint(89.1952));
        System.out.println("round: "+ Math.round(89.7952));
        System.out.println("round: "+ Math.round(89.1952));
        System.out.println(Math.round((1.0/3)*1000)/1000.0);
        //MAX MIN, ABS FUNCTIONS
        System.out.println(Math.max(89.34, Math.max(7.9, Math.max(4.9, -45))));
        System.out.println(Math.min(1.34, -555));
        System.out.println(Math.abs(-12));
        //RANDOM NUMBER GENERATOR
        double randNum = Math.random();
        System.out.println(randNum);
        System.out.println((int)(randNum*3));

    }
}
