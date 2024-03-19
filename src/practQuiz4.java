public class practQuiz4 {
    public static void main(String[] args) {
        for(int i =10;i<=500;i++){
            if ((i%3==0&i%4==0)&!(i%5==0)){
                System.out.println(i);
            }
        }
    }
}
