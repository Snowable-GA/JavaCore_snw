package Homework.Overload.Shapes;

public class Triangle {

    public static void drawTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2 * 5; j++) {
                if (j >= 5 - 1 - i && j <= 5 - 1 + i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        drawTriangle();
        drawTriangle(5);
    }
}
