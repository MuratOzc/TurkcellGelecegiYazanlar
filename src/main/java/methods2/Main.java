package methods2;

public class Main {
    public static void main(String[] args){
        String message ="Weather is great today";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int num = add(5,7);
        System.out.println(num);
        int sum = addMultiple(7,5,7,9,6,2,1,0);
        System.out.println(sum);
    }

    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int addMultiple(int... numbers){
        int sum = 0;
        for (int num:numbers){
            sum += num;
        }
        return sum;
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static String giveCity(){
        String city = "Ankara";
        return city;
    }

}
