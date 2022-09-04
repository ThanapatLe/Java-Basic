
package IntegerList;

public class TestIntegerList {
        public static void main(String[] args) {

        IntegerList list = new IntegerList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.find(2));
        System.out.println(list.find(1));
        System.out.println(list.min());
        System.out.println(list.max());
        System.out.println(list.sum());
        list.reset();
        System.out.println(list);

    }
}
