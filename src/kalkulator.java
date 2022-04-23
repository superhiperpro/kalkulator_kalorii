import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class kalkulator {
    public static void main(String[] args){

        Short weight;
    Short height;
    Short age;
    Short sex;
    int constantForWoman = 161;
    int constantForMan =5;


    System.out.println("Witaj w kalkulatorze zapotrzebowania kalorycznego.");
    System.out.println("Jeżeli jesteś Kobietą wciśnij 1. Jeżeli mężczyzną wciśnij 2.");
    Scanner scanner = new Scanner(System.in);
    sex = scanner.nextShort();
    System.out.println("Podaj swój wzrost w cm");
        height = scanner.nextShort();
    System.out.println("Podaj swój wiek");
        age = scanner.nextShort();
    System.out.println("Podaj swoją wagę");
        weight = scanner.nextShort();

        if (sex == 1) {
            System.out.println("Twoje zapotrzebowanie na kalorie to "+((10 * weight) + (6.25 * height) - (5 * age) - 161)+" Kcal");
             }
        else {
            System.out.println("Twoje zapotrzebowanie na kalorie to "+((10 * weight) + (6.25 * height) - (5 * age) + 5)+" Kcal");
        }
    }

}
