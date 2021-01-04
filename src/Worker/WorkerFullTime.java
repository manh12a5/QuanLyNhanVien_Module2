package Worker;

import java.util.Scanner;

public class WorkerFullTime extends Worker {

    //Danh sách thuộc tính
    private int bonusMoney;
    private int forfeit;
    private int totalMoney;

    //Constructor
    public WorkerFullTime() {
    }

    public WorkerFullTime(int bonusMoney, int forfeit, int totalMoney) {
        this.bonusMoney = bonusMoney;
        this.forfeit = forfeit;
        this.totalMoney = totalMoney;
    }

    public WorkerFullTime(int numberWorker, String name, byte age, String phoneNumber, String email, int bonusMoney, int forfeit, int totalMoney) {
        super(numberWorker, name, age, phoneNumber, email);
        this.bonusMoney = bonusMoney;
        this.forfeit = forfeit;
        this.totalMoney = totalMoney;
    }

    //Getter and Setter
    public int getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(int bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public int getForfeit() {
        return forfeit;
    }

    public void setForfeit(int forfeit) {
        this.forfeit = forfeit;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    //Danh sách phương thức
    public void addWorkerFullTime() {
        super.addWorker();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số tiền thưởng: ");
        bonusMoney = scanner.nextInt();
        System.out.println("Nhập số tiền phạt: ");
        forfeit = scanner1.nextInt();
        System.out.println("Nhập lương cứng: ");
        totalMoney = scanner.nextInt();
    }

    public double salaryFullTime() {
        return totalMoney + (bonusMoney - forfeit);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "{ WorkerFullTime }" + "\n" +
                "Tiền thưởng: " + bonusMoney + "\n" +
                "Tiền phạt: " + forfeit + "\n" +
                "Lương cứng: " + totalMoney;
    }

}
