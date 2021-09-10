package Java.homework.Homework_2;

public class Task3 {

    public static void main(String[] args) {
        boolean redIsHitFromBehind=true;
        boolean blackIsHitFromBehind=false;
        if (redIsHitFromBehind == true && blackIsHitFromBehind == false) {
            System.out.println("black");
        } else if (redIsHitFromBehind == false && blackIsHitFromBehind == true) {
            System.out.println("red");
        } else if ((redIsHitFromBehind == true && blackIsHitFromBehind == true) || (redIsHitFromBehind == false && blackIsHitFromBehind == false))  {
            System.out.println("Invalid state");
        }
        }
    }

