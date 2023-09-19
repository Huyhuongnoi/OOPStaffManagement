import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {
    public static void addData(ArrayList<String> arr, ArrayList<String> arrName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Ban muon them can bo nao?\n1. Ky su\n2. Cong nhan\n3. Nhan vien");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("Ban dang them ky su: ");
                System.out.print("Nhap nganh dao tao: ");
                String trainingIndustry = scanner.nextLine();
                Engineer engineer = new Engineer(name, age, sex, address, trainingIndustry);
                arr.add(engineer.dataKySu());
                arrName.add(engineer.getName());
                break;
            case 2:
                System.out.println("Ban dang them cong nhan: ");
                System.out.print("Nhap cap bac 1-10: ");
                int rank = scanner.nextInt();
                Worker worker = new Worker(name, age, sex, address, rank);
                arr.add(worker.dataCongNhan());
                arrName.add(worker.getName());
                break;
            case 3:
                System.out.println("Ban dang them nhan vien: ");
                System.out.print("Nhap cong viec: ");
                String job = scanner.nextLine();
                Staff staff = new Staff(name, age, sex, address, job);
                arr.add(staff.dataNhanVien());
                arrName.add(staff.getName());
                break;
            default:
                System.out.println("Loi!");
                break;
        }
    }
    public static void findData(ArrayList<String> arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten ban muon tim kiem: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for(String val : arr){
            int index = val.indexOf(name);
            if(index != -1){
                System.out.println(val);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Khong tim thay!");
        }
    }
    public static void findChar(ArrayList<String> arrName, ArrayList<String> arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu ten muon tim kiem: ");
        String charName = scanner.next();
        int count = -1;
        for(String val : arrName){
            int index = val.indexOf(charName);
            count += 1;
            if(index != -1){
                System.out.println(arr.get(count));
            }
        }
    }
    public static void printData(ArrayList<String> arr){
        for(String val : arr){
            System.out.println(val);
        }
    }
}

