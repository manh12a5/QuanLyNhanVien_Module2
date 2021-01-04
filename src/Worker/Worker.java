package Worker;

import java.util.Scanner;

public abstract class Worker {

    //Danh sách thuộc tính
    private int numberWorker;
    private String name;
    private byte age;
    private String phoneNumber;
    private String email;

    //Constructor
    public Worker() {
    }

    public Worker(int numberWorker, String name, byte age, String phoneNumber, String email) {
        this.numberWorker = numberWorker;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Getter and Setter
    public int getNumberWorker() {
        return numberWorker;
    }

    public void setNumberWorker(int numberWorker) {
        this.numberWorker = numberWorker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Interface tổng tiền
    public abstract int getSalary();

    //Danh sách phương thức
    public void addWorker() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        numberWorker = scanner.nextInt();
        System.out.println("Nhập tên nhân viên: ");
        name = scanner1.nextLine();
        do {
            System.out.println("Nhập tuổi: ");
            age = scanner2.nextByte();
        } while (!checkAge(age));
        do {
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = scanner1.nextLine();
        } while (!checkPhone(phoneNumber));
        do {
            System.out.println("Nhập Email: ");
            email = scanner1.nextLine();
        } while (!checkEmail(email));
    }

    public boolean checkAge(byte age) {
        if (age >= 18 && age <= 65) {
            return true;
        } else {
            System.err.println("Độ tuổi phải trong khoảng 18-65");
            return false;
        }
    }

    public boolean checkPhone(String phone) {
       if (phone.length() < 10) {
           System.err.println("Số điện thoại có 10 số");
           return false;
       } else {
           return true;
       }
    }

    public boolean checkEmail(String email) {
        for (int i = 0; i < email.length(); i++) {
            if(!email.contains("@")) {
                System.err.println("Email phải có @");
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "{ Worker }" + "\n" +
                "Mã nhân viên: " + numberWorker + "\n" +
                "Tên nhân viên: " + name + "\n" +
                "Tuổi: " + age + "\n" +
                "Số điện thoại: " + phoneNumber + "\n" +
                "Email: " + email + "\n" +
                "--------------------";
    }

}
