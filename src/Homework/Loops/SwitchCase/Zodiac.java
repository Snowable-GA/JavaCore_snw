package Homework.Loops.SwitchCase;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day:");
        byte day = input.nextByte();
        System.out.println("Enter month:");
        byte month = input.nextByte();

        switch (month){
            case 1:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 19){
                    System.out.println("Capricorn");
                }
                else System.out.println("Aquarius");
                break;
            case 2:
                if(day > 29 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 18 ){
                    System.out.println("Aquarius");
                }
                else System.out.println("Pisces");
                break;
            case 3:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <=20){
                    System.out.println("Pisces");
                }
                else System.out.println("Aries");
                break;
            case 4:
                if(day > 30 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 19){
                    System.out.println("Aries");
                }
                else System.out.println("Taurus");
                break;
            case 5:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 20){
                    System.out.println("Taurus");
                }
                else System.out.println("Gemini");
                break;
            case 6:
                if(day > 30 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 20){
                    System.out.println("Gemini");
                }
                else System.out.println("Cancer");
                break;
            case 7:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 22){
                    System.out.println("Cancer");
                }
                else System.out.println("Leo");
                break;
            case 8:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 22){
                    System.out.println("Leo");
                }
                else System.out.println("Virgo");
                break;
            case 9:
                if(day > 30 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 22){
                    System.out.println("Virgo");
                }
                else System.out.println("Libra");
                break;
            case 10:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 22){
                    System.out.println("Libra");
                }
                else System.out.println("Scorpio");
                break;
            case 11:
                if(day > 30 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 21){
                    System.out.println("Scorpio");
                }
                else System.out.println("Sagittarius");
                break;
            case 12:
                if(day > 31 || day < 1) System.out.println("Invalid day!!!");
                else if(day <= 21){
                    System.out.println("Sagittarius");
                }
                else System.out.println("Capricorn");
                break;
            default:
                System.out.println("Invalid month!");
            }
        }
    }

