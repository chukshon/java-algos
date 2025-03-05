// Description: The goal is to return multiplication table for number that is always an integer from 1 to 10.

public class mulitplicationTableForNumbers {
    public static String multiplicationTable(int number){
        String result = "";
        
          for(int i = 1; i <= 10; i++){
            result += number + " x " + i + " = " + number * i + "\n";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(multiplicationTable(5));
    }
    
}
