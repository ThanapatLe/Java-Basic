
package IntegerList;

public class IntegerList {

    private int head = -1;
    private int[] list;

    public IntegerList(int n) {
        list = new int[n];
    }

    public void add(int e) {
        head++;
        if (head < list.length) {
            
            list[head] = e;
        } else {
            int[] temp = new int[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            temp[head] = e;
            list = temp;
        }
    }  
    //  012345        012345 
    // -101234 head++ 012345
    

    public int find(int e) {
        int found = -1;
        for (int i = 0; i <= head; i++) {
            if (e == list[i]) {
                found = i;
            }
        }
        System.out.print("The index of " + e + " is ");
        return found;
    }

    public int min() {
        int min = list[0];
        for (int i = 1; i <= head; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        System.out.print("Min value is ");
        return min;
    }

    public int max() {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        System.out.print("Max value is ");
        return max;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.print("Sum of list's member is ");
        return sum;
    }

    public void reset() {
        for (int i = 0; i < list.length; i++) {
            list[i] = 0;
        }
    }

    @Override
    public String toString() {
        System.out.print("list={");
        for (int i = 0; i < list.length; i++) { //list.length or <= head 
            System.out.print(list[i]);
            if (i == list.length-1) { //or head .
                System.out.print("");
            } else {
                System.out.print(", ");
            }
        }
        return "}";
    }

}
