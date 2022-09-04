
package Learnpackages;

public class TestMoney {
    public static void main(String[] args) {
//        double interest =0.07;
//        double money = 5000;
//        int months  = 12;
//        for (int i = 0; i < months; i++){
//            money  += money * interest/12;
//        }
//        System.out.println(money);
//    }
int scoreA = 30, scoreB = 45;
 char candidateA = 'D', candidateB = 'D', candidateC = 'D';
 if (scoreA > 20) {
 candidateA = 'B';
 } else if (scoreB > 30) {
 candidateB = 'A';
 }
 if (scoreB > 3) {
 candidateC = 'C';
 }
 System.out.println(candidateA);
 System.out.println(candidateB);
 System.out.println(candidateC);
}
}
