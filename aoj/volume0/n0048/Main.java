import java.util.Scanner;

public class Sample {

    private static final String[] WEIGHT_CLASS_NAMES = {"light fly", "fly", "bantam", "feather", "light", "light welter", "welter", "light middle", "middle", "light heavy", "heavy"};
    private static final double[] WEIGHT_CLASS_DIVISIONS = {48.0, 51.0, 54.0, 57.0, 60.0, 64.0, 69.0, 75.0, 81.0, 91.0};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double weight = sc.nextDouble();
            String weightClassName;

            if (weight <= WEIGHT_CLASS_DIVISIONS[0]) {
                weightClassName = WEIGHT_CLASS_NAMES[0];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[0] && WEIGHT_CLASS_DIVISIONS[1] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[1];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[1] && WEIGHT_CLASS_DIVISIONS[2] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[2];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[2] && WEIGHT_CLASS_DIVISIONS[3] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[3];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[3] && WEIGHT_CLASS_DIVISIONS[4] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[4];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[4] && WEIGHT_CLASS_DIVISIONS[5] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[5];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[5] && WEIGHT_CLASS_DIVISIONS[6] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[6];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[6] && WEIGHT_CLASS_DIVISIONS[7] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[7];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[7] && WEIGHT_CLASS_DIVISIONS[8] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[8];
            } else if (weight > WEIGHT_CLASS_DIVISIONS[8] && WEIGHT_CLASS_DIVISIONS[9] >= weight) {
                weightClassName = WEIGHT_CLASS_NAMES[9];
            } else {
                weightClassName = WEIGHT_CLASS_NAMES[10];
            }

            System.out.println(weightClassName);

        }

    }

}
