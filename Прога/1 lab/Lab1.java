import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {
        var z = array1();
        var x = array2();
        var r = array3(z, x);
        print_matrix(r);


    }

    public static short[] array1() {
        short[] z = new short[16];
        for (short i = 16; i > 0; i--) {
            z[16 - i] = i;
        }
        return z;
    }

    public static double[] array2() {
        double[] x = new double[18];
        Random rand = new Random();

        for (int i = 0; i < 18; i++) {
            x[i] = rand.nextDouble(-12.0, 10.0);
        }
        return x;
    }

    public static double[][] array3(short[] z, double[] x) {
        double[][] r = new double[16][18];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 18; j++) {
                r[i][j] = matrix_value(x[j], z[i]);
            }
        }

        return r;
    }

    public static double matrix_value(double x, short z_i) {
        return switch (z_i) {
            case 13 -> Math.pow(Math.E, Math.asin(Math.cos(x)));
            case 2, 3, 4, 6, 7, 8, 10, 11 ->
                    Math.pow(1.0 / 3.0 * Math.cos(x), 3.0 / 2.0 * Math.pow(Math.sin(x), 1.0 / 3.0));
            default -> Math.pow(4.0 / (1 - Math.asin((x - 1) / 88.0)), 3);
        };

    }

    public static void print_matrix(double[][] matrix) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.printf("%8.4f", matrix[i][j]);
            }
            System.out.println("\n");
        }
    }
}