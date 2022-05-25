package md2.views;

import md2.service.ProductService;
import md2.utils.ApUntils;
import md2.utils.CSVUntils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductViewLancher {
    Scanner scanner =new Scanner(System.in);
    static String path = "thithuchanhmode2/data/products.csv";
    private ProductService productService ;
    public static void run() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();
            menuProduct();
            try {
                System.out.println("\nChọn chức năng: ");
                System.out.print("⭆ ");
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        productView.showProducts(InputOption.SHOW);
                        break;
                    case 2:
                        productView.add();
                        break;
                    case 3:
                        productView.update();
                        break;
                    case 4:
                        productView.remove();
                        break;
                    case 5:
                        productView.sortsByPriceOrderByASC();
                        break;
                    case 6:
                        productView.findProductByTheMostPrice();
                        break;
                    case 7:
                       CSVUntils.read(path);
                        System.out.println("đọc từ file products.csv");
                        break;
                    case 8:
                        CSVUntils.write(path, ProductService.getInstance().findAll());

                        break;
                    case 9:
                        ApUntils.exit();
                        break;
                    default:
                        System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        run();
                }
            } catch (InputMismatchException io) {
                System.err.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void menuProduct() {
        System.out.println();
        System.out.println("* * * CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM  * * *");
        System.out.println("*    Chọn chức năng theo số để tiếp tục  *");
        System.out.println("*    1. Xem danh sách                    *");
        System.out.println("*    2. Thêm mới                         *");
        System.out.println("*    3. Cập nhật                         *");
        System.out.println("*    4. Xóa                              *");
        System.out.println("*    5. Sắp xếp giá tăng dần             *");
        System.out.println("*    6. Tìm kiếm sản phầm có giá đắt nhất*");
        System.out.println("*    7. Đọc từ file                      *");
        System.out.println("*    8. Ghi từ file                      *");
        System.out.println("*    9. Thoát                            *");
        System.out.println("*                                        *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
    }
}