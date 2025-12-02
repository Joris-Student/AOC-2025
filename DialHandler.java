public class DialHandler {
    private static int dialState = 50;
    private static int zerosCounted;

    public static void calculateDialPosition(char currentDirection, int currentDialRotations) {
        if (currentDirection == 'L') {
            dialState = Math.floorMod(dialState - currentDialRotations, 100);
        } else {
            dialState = Math.floorMod(dialState + currentDialRotations, 100);
        }

        if (dialState == 0) {
            zerosCounted++;
        }
    }

    public static void getZeroes() {
        System.out.println(zerosCounted);
    }
}