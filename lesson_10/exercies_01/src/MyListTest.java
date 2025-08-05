public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("Size after adding: " + list.size());

        System.out.println("Element at index 1: " + list.get(1));

        list.add(1, "JavaScript");
        System.out.println("Element at index 1 after insrrt: " + list.get(1));

        System.out.println("Contains Java: " + list.contains("Java"));

        list.remove(2);
        System.out.println("Element at index 2 after remove: " + list.get(2));

        System.out.println("All elements: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
