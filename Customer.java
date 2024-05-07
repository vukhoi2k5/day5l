package codeLuyenday5;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    ArrayList<List> lists = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void create() {
        System.out.println("Nhập thông tin");
        System.out.println("ID :");
        long id = sc.nextLong();
        System.out.println("Last Name :");
        String lastName = sc.next();
        System.out.println("First Name :");
        String firstName = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        List list = new List();
        list.setId(id);
        list.setLastName(lastName);
        list.setFirstName(firstName);
        list.setAge(age);
        lists.add(list);
    }
    public void show() {
        System.out.printf("%-15s || %-15s || %-15s ||%-15s\n", "Id", "firstName", "lastName", "Email", "Phone number", "Address", "Age");
        for (int i = 0; i < lists.size(); i++) {
            List list = lists.get(i);
            System.out.printf(" %-15s || %-15s || %-15s ||%-15s\n", list.getId(), list.getFirstName(), list.getLastName(), list.getAge());
        }
    }
    public void edit(){
        System.out.println("Nhập dữ liệu cần edit");
        long id = sc.nextLong();
        for(int i = 0; i < this.lists.size(); ++i) {
            List list = lists.get(i);
            if(list.getId() == id) {
                System.out.printf("%-15s || %-15s || %-15s ||%-15s\n", "Id", "firstName", "lastName", "Email", "Phone number", "Address", "Age");
                System.out.printf("%-15s || %-15s || %-15s ||%-15s\n", list.getId(), list.getFirstName(), list.getLastName(), list.getAge());

                System.out.println("Update");
                System.out.println("Last Name :");
                String lastName = sc.next();
                System.out.println("First Name :");
                String firstName = sc.next();
                System.out.println("Age :");
                int age = sc.nextInt();
                list.setLastName(lastName);
                list.setFirstName(firstName);
                list.setAge(age);
            }
        }
    }
    public void delete() {
        System.out.println("Nhập dữ liệu cần xoa");
        long id = sc.nextLong();
        System.out.println("Bạn chac chắn muốn xóa không ");
        System.out.println("1.Xóa");
        System.out.println("2.thoat");
        int choice = sc.nextInt();
        if (choice == 1 )
        {
            for(int i = 0; i < this.lists.size(); ++i) {
                List list = lists.get(i);
                if(list.getId() == id) {
                    lists.remove(i);
                    System.out.println("Xóa thành công");
                }
            }
        }
        else if (choice == 2 ){
        }
        else {
            System.out.println("Lỗi");
        }
    }
}
