public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntrger = new MyList<Integer>();
        listIntrger.add(1);
        listIntrger.add(2);
        listIntrger.add(3);
        listIntrger.add(4);
        listIntrger.add(5);

        System.out.println("element 4: " + listIntrger.get(4));
        System.out.println("element 1: " + listIntrger.get(1));
        System.out.println("element 2: " + listIntrger.get(2));

        listIntrger.add(6);
        System.out.println("element 6: " + listIntrger.get(5));
        listIntrger.add(-1);
        System.out.println("element -1: " + listIntrger.get(7));
    }
}
