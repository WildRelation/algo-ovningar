public class Main{
    public static void main(String[] args) {
        System.out.println("IntList");
        IntList intList = new IntList(3);
        intList.add(4);
        intList.add(2);
        intList.add(3);
        intList.add(3);

        System.out.println(intList);
    }
}