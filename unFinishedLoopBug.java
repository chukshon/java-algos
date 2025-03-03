// Unfinished Loop - Bug Fixing #1
// Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

import java.util.ArrayList;
import java.util.List;

public class unFinishedLoopBug {

    public static List<Integer> CreateList(int number){
        List<Integer> list = new ArrayList<>(number);
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(CreateList(5));
        System.out.println("test");
    }
}
