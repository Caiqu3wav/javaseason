package projects;

public class phoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length < 10){
            System.out.println("Need to be 10 numbers");
        }
        java.lang.String phoneNumber = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0){
                phoneNumber += "(";
            }
            if (i == 3){
                phoneNumber += ") ";
            }
            if (i == 6){
                phoneNumber += "-";
            }
            phoneNumber += numbers[i];
        }
        return phoneNumber;
    }

    public static void main(String[] args){
        int[] numbers = {1, 2, 5, 4, 4, 4 , 8, 7, 3, 8};
        System.out.println(createPhoneNumber(numbers));
    }
}
