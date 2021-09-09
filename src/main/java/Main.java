public class Main {

    public static void main(String[] args) {
        System.out.println(calculate(7));

    }

//    public static int calculate(int int1){
//        int result = 1;
//        for(int i = 1; i <= int1; i++){
//           result = result*i; // result *= i;
//
//        }
//        return result;
//    }

    public static int calculate(int int1){
        int number = int1;
        int i = 1;
        int result = 1;

        while(i <= number){
            result *= i;
            i++;
        }
        return result;
    }

}
