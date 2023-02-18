import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("White");
        list1.add("Pink");
        list1.add("Blue");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("Red");
        list2.add("Blue");

        ArrayList<String> list3 = new ArrayList<String>();
        for (String match : list1) {
            if (list2.contains(match)){
                list3.add("Yes");
            }else{
                list3.add("No");
            }
        }
        for (String match : list3)
        System.out.println(match);
    }
}

