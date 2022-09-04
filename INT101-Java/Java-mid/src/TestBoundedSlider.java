public class TestBoundedSlider {
    public static void main(String[] args) {
        BoundedSlider a = new BoundedSlider(0,10,1);
        a.Down();
        System.out.println(a);
    }
}