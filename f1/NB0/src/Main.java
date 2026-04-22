import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NArrayList<String> myArray = new NArrayList<>();
        System.out.println(myArray.toString());
        myArray.add("Hello");
        myArray.add("Ruby");
        myArray.add("Joseph");
        int index = myArray.indexOf("Joseph");

        System.out.println(myArray.toString());
        ArrayList<String> newArray = new ArrayList<>(myArray.getCopy());
        System.out.println("This is ArrayList");
        System.out.println(newArray.toString());
        NArrayList.replace(newArray, "Ruby", "Sofi");
        System.out.println(newArray.toString());
        NArrayList.delete(newArray, "Sofi");
        System.out.println(newArray.toString());


        System.out.println("Finished");
//        System.out.println(index);
//        myArray.remove(2);
//        System.out.println(myArray.toString());
//        myArray.remove(0);
//        System.out.println(myArray.toString());


    }
}
