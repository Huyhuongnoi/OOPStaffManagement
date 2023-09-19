import java.util.ArrayList;
import java.util.Scanner;
public class LGCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrData = new ArrayList<String>();
        ArrayList<String> arrName = new ArrayList<String>();
        boolean flag = true;
        while (flag) {
            System.out.println("Chon mot trong cac chuc nang sau");
            System.out.println("1: Them Moi Can Bo.\n2: Tim Kiem Theo Ten.\n3: Tim Kiem Theo Ki Tu Cua Ten.\n4: Hien Thi Thong Tin Ve Danh Sach Cac Can Bo. \n5: Thoat");
            int choice = scanner.nextInt();
            StaffManagement staffManagement = new StaffManagement();
            switch (choice) {
                case 1:
                    staffManagement.addData(arrData, arrName);
                    break;
                case 2:
                    staffManagement.findData(arrData);
                    break;
                case 3:
                    staffManagement.findChar(arrName, arrData);
                    break;
                case 4:
                    staffManagement.printData(arrData);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui Long Chon Lai!: ");
            }
        }
    }
}
