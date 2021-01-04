package Worker;

import java.util.Scanner;

public class WorkerPartTime extends Worker {

    //Danh sách thuộc tính
    private int timeWork;

    //Constructor
    public WorkerPartTime() {
    }

    public WorkerPartTime(int timeWork) {
        this.timeWork = timeWork;
    }

    public WorkerPartTime(int numberWorker, String name, byte age, String phoneNumber, String email, int timeWork) {
        super(numberWorker, name, age, phoneNumber, email);
        this.timeWork = timeWork;
    }

    //Getter and Setter
    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    //Danh sách phương thức
    public void addWorkerPartTime() {
        super.addWorker();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số giờ làm việc: ");
            timeWork = scanner.nextInt();
        } while (timeWork < 0);
    }

    public double salaryPartTime() {
        return timeWork * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "{ WorkerPartTime }" + "\n" +
                "Giờ làm việc: " + timeWork;
    }

}
