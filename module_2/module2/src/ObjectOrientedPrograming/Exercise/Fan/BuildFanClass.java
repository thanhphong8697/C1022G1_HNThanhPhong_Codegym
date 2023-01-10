package ObjectOrientedPrograming.Exercise.Fan;
public class BuildFanClass {
    public static void main(String[] args) {
        FanClass fanNumb1 = new FanClass();
        fanNumb1.setSpeed(FanClass.FAST);
        fanNumb1.setColor("Yellow");
        fanNumb1.setRadius(10);
        fanNumb1.setOn(true);
        System.out.print("Fan number 1: ");
        System.out.println(fanNumb1.toString());
        FanClass fanNumb2 = new FanClass();
        fanNumb2.setSpeed(FanClass.MEDIUM);
        fanNumb2.setColor("Blue");
        fanNumb2.setRadius(5);
        fanNumb2.setOn(false);
        System.out.print("Fan number 2: ");
        System.out.println(fanNumb2.toString());
    }
}
