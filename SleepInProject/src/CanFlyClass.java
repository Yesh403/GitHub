public class CanFlyClass {

    public static void main(String[] args) {
        canThisFly(true);
        canThisFly(false);

    }

    public static void canThisFly( boolean hasWings){
    if( hasWings==true){
        System.out.println("can fly");
    }
    else{
        System.out.println("cannot fly");
    }
    }

}
