package codeLuyenday5;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        choice();
    }

    public static void choice() {
        boolean flag = true;
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng học sinh bạn muốn nhập  : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            customer.create();
        }
        while (flag) {
            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            System.out.println("1.Thêm");
            System.out.println("2.Show");
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    customer.create();
                    break;
                case 2:
                    customer.show();
                    break;
                case 3:
                    customer.edit();
                    break;
                case 4:
                    customer.delete();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        if (flag!= true){

        }
    }
}
