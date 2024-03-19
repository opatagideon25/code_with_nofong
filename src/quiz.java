public class quiz {
    public static void main(String[] args) {
        int loopCount = 0;
        int number = 7;
        while (loopCount<20){
            if ((number%3==0) && (number%7==0)){
                System.out.println(number);
                loopCount++;
            }
            number++;
        }
    }
}
