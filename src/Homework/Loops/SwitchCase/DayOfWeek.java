package Homework.Loops.SwitchCase;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayOfWeek  = input.nextLine();
        System.out.println();

        switch (dayOfWeek){
            case "Thứ Hai":
            case "THỨ HAI":
            case "thứ hai":
                System.out.println("Monday");
                break;
            case "Thứ Ba":
            case "THỨ BA":
            case "thứ ba":
                System.out.println("Tuesday");
                break;
            case "Thứ Tư":
            case "THỨ TƯ":
            case "thứ tư":
                System.out.println("Wednesday");
                break;
            case "Thứ Năm":
            case "THỨ NĂM":
            case "thứ năm":
                System.out.println("Thursday");
                break;
            case "Thứ Sáu":
            case "THỨ SÁU":
            case "thứ sáu":
                System.out.println("Friday");
                break;
            case "Thứ Bảy":
            case "THỨ BẢY":
            case "thứ bảy":
                System.out.println("Saturday");
                break;
            case "CHủ Nhật":
            case "CHỦ NHẬT":
            case "chủ nhật":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of week!");
        }
    }
}
