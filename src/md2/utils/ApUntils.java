package md2.utils;

import md2.views.InputOption;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ApUntils {
    static Scanner scanner = new Scanner(System.in);

    public static String doubleToVND(double value) {
        String patternVND =",###₫";
        DecimalFormat decimalFormat =new DecimalFormat(patternVND);
        return decimalFormat.format(value);
    }
    public static int retryChoose(int min, int max) {
        int option;
        do {
            System.out.print(" ⭆ ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option > max || option < min) {
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    continue;
                }
                break;
            } catch (Exception ex) {
                System.err.println("Nhập sai! vui lòng nhập lại");
            }
        } while (true);
        return option;
    }

    public static boolean isRetry(InputOption inputOption) {

        do {
            switch (inputOption) {
                case ADD:
                    System.out.println("Nhấn 'y' để thêm tiếp \t" +
                            "\t 'b' để quay lại \t" +
                            "\t 'e' để thoát chương trình");
                    break;
                case UPDATE:
                    System.out.println("Nhấn 'y' để sửa tiếp \t" +
                            "\t 'b' để quay lại\t" +
                            "\t 'e' để thoát chương trình");
                    break;
                case DELETE:
                    System.out.println("Nhấn 'b' để quay lại\t" +
                            "\t 'e' để thoát chương trình");
                    break;
                case SHOW:
                    System.out.println("Nhấn 'q' để trở lại \t" +
                            "\t 'e' để thoát chương trình");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + inputOption);
            }

            System.out.print(" ⭆ ");
            String option = scanner.nextLine();
            switch (option) {
                case "y":
                    return true;
                case "b":
                    return false;
                case "e":
                    exit();
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    break;
            }
        } while (true);
    }
    public static void exit() {
        System.out.println("\tTạm biệt. Hẹn gặp lại!");
        System.exit(5);
    }
    public static double retryParseDouble() {
        double result;
        do {
            System.out.print(" ⭆ ");
            try {
                result = Double.parseDouble(scanner.nextLine());
                return result;
            } catch (Exception ex) {
                System.err.print("Nhập sai! vui lòng nhập lại");
            }
        } while (true);
    }
    public static int retryParseInt() {
        int result;
        do {
            System.out.print(" ⭆ ");
            try {
                result = Integer.parseInt(scanner.nextLine());
                return result;
            } catch (Exception ex) {
                System.err.println("Nhập sai! vui lòng nhập lại");
            }

        } while (true);
    }
}
