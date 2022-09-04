
package Learnpackages;

public class TestRemote {
    public static void main(String[] args) {
        Navigation2D nav = new Navigation2D(5, 5);
        nav.turnOn();
        nav.moveUp();
        nav.moveRight();
      System.out.println(nav);
    }
}
