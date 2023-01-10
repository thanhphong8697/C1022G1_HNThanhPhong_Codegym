package introduction_java.exercise;

import java.util.Scanner;

public class NumberConversionBecomeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer number");
        String str = scanner.nextLine();
        int size = str.length();
        if (size == 1) {
            switch (str) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
            }
        }
        if (size == 2) {
            if (Integer.parseInt(str) < 20) {
                switch (str) {
                    case "10":
                        System.out.println("Ten");
                        break;
                    case "11":
                        System.out.println("Eleven");
                        break;
                    case "12":
                        System.out.println("Twelve");
                        break;
                    case "13":
                        System.out.println("Thirteen");
                        break;
                    case "14":
                        System.out.println("Fourteen");
                        break;
                    case "15":
                        System.out.println("Fifteen");
                        break;
                    case "16":
                        System.out.println("Sixteen");
                        break;
                    case "17":
                        System.out.println("Seventeen");
                        break;
                    case "18":
                        System.out.println("Eighteen");
                        break;
                    case "19":
                        System.out.println("Nineteen");
                        break;
                }
            } else {
                switch (str.substring(0, 1)) {
                    case "2":
                        System.out.print("Twenty ");
                        break;
                    case "3":
                        System.out.print("Thirty ");
                        break;
                    case "4":
                        System.out.print("Fourty ");
                        break;
                    case "5":
                        System.out.print("Fifty ");
                        break;
                    case "6":
                        System.out.print("Sixty ");
                        break;
                    case "7":
                        System.out.print("Seventy ");
                        break;
                    case "8":
                        System.out.print("Eighty ");
                        break;
                    case "9":
                        System.out.print("Ninety ");
                        break;
                }
                switch (str.substring(1)) {
                    case "0":
                        System.out.print(" ");
                        break;
                    case "1":
                        System.out.print("One");
                        break;
                    case "2":
                        System.out.print("Two");
                        break;
                    case "3":
                        System.out.print("Three");
                        break;
                    case "4":
                        System.out.print("Four");
                        break;
                    case "5":
                        System.out.print("Five");
                        break;
                    case "6":
                        System.out.print("Six");
                        break;
                    case "7":
                        System.out.print("Seven");
                        break;
                    case "8":
                        System.out.print("Eight");
                        break;
                    case "9":
                        System.out.print("Nine");
                        break;
                }
            }
        }
        if (size == 3) {
            switch (str.substring(0, 1)) {
                case "1":
                    System.out.print("One hundred ");
                    break;
                case "2":
                    System.out.print("Two hundred ");
                    break;
                case "3":
                    System.out.print("Three hundred ");
                    break;
                case "4":
                    System.out.print("Four hundred ");
                    break;
                case "5":
                    System.out.println("Five hundred ");
                    break;
                case "6":
                    System.out.print("Six hundred ");
                    break;
                case "7":
                    System.out.print("Seven hundred ");
                    break;
                case "8":
                    System.out.print("Eight hundred ");
                    break;
                case "9":
                    System.out.print("Nine hundred ");
                    break;
            }
            switch (str.charAt(1)) {
                case '2':
                    System.out.print("Twenty ");
                    break;
                case '3':
                    System.out.print("Thirty ");
                    break;
                case '4':
                    System.out.print("Fourty ");
                    break;
                case '5':
                    System.out.print("Fifty ");
                    break;
                case '6':
                    System.out.print("Sixty ");
                    break;
                case '7':
                    System.out.print("Seventy ");
                    break;
                case '8':
                    System.out.print("Eighty ");
                    break;
                case '9':
                    System.out.print("Ninety ");
                    break;
            }
            switch (str.substring(2)) {
                case "0":
                    System.out.print(" ");
                    break;
                case "1":
                    System.out.print("One");
                    break;
                case "2":
                    System.out.print("Two");
                    break;
                case "3":
                    System.out.print("Three");
                    break;
                case "4":
                    System.out.print("Four");
                    break;
                case "5":
                    System.out.print("Five");
                    break;
                case "6":
                    System.out.print("Six");
                    break;
                case "7":
                    System.out.print("Seven");
                    break;
                case "8":
                    System.out.print("Eight");
                    break;
                case "9":
                    System.out.print("Nine");
                    break;
            }
        }
    }
}
