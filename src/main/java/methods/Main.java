package methods;

public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int numberToFind = 6;
        boolean exists=false;

        for (int num : numbers){
            if (num == numberToFind){
                exists = true;
                break;
            }
        }

        String answer = "";

        if (exists){
            answer = "Number exists: " + numberToFind;
            giveAnswer(answer);
        }else{
            answer = "Number does not exist: " + numberToFind;
            giveAnswer(answer);
        }
    }

    public static void giveAnswer(String answer){
        System.out.println(answer);
    }
}