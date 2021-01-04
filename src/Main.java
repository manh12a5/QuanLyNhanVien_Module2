import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerWorker managerWorker = new ManagerWorker();

    public static void main(String[] args) {
        System.out.println("---- Quản Lý Nhân Viên ----");
        byte choice;
        do {
            listChoice();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Add
                    listChoiceWorker();
                    break;
                case 2:
                    //Check Salary < 8 triệu
                    managerWorker.averageSalaryFullTime();
                    break;
                case 3:
                    //Total salary PartTime
                    managerWorker.totalSalaryPartTime();
                    break;
                case 4:
                    //Sort Salary
                    managerWorker.sortWorker();
                    break;
            }
        } while (choice != 0);
        System.exit(0);
    }

    private static void listChoice() {
        System.out.println("1. Nhập thông tin nhân viên");
        System.out.println("2. Liệt kê những nhân viên FullTime lương thấp hơn 8 triệu");
        System.out.println("3. Tính tiền lương nhân viên PartTime");
        System.out.println("4. Sắp xếp lương nhân viên FullTime tăng dần");
        System.out.println("0. Exit");
        System.out.print("Choice Number: ");
    }

    private static void listChoiceWorker() {
        byte number;
        do {
            System.out.println("1. Nhân viên FullTime");
            System.out.println("2. Nhân viên PartTime");
            System.out.println("0. Trở lại");
            System.out.print("Choice Number: ");
            number = scanner.nextByte();
            switch (number) {
                case 1:
                    //FullTime
                    managerWorker.addNewWorkerFullTime();
                    break;
                case 2:
                    //PartTime
                    managerWorker.addNewWorkerPartTime();
                    break;
            }
        } while (number != 0);
    }

}
