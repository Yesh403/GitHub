public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true , true));
        System.out.println(monkeyTrouble(false , false));
        System.out.println(monkeyTrouble(true , false));
        System.out.println(monkeyTrouble(false, true));

    }
    public static boolean monkeyTrouble(aSmile,bSmile){
        if (aSmile == true && bSmile == true){
            return true;
        }
        else if (aSmile== false && bSmile==false) {
            return true;
        }
        else {
            return false}

        }
    }

