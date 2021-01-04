import Worker.Worker;
import Worker.WorkerFullTime;
import Worker.WorkerPartTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerWorker {

    //Danh sách thuộc tính
    List<Worker> arrWorkers = new ArrayList<>();

    //Danh sách phương thức

    //Thêm nhân viên
    public void addNewWorkerFullTime() {
        WorkerFullTime workerFullTime = new WorkerFullTime();
        workerFullTime.addWorkerFullTime();
        arrWorkers.add(workerFullTime);
    }

    public void addNewWorkerPartTime() {
        WorkerPartTime workerPartTime = new WorkerPartTime();
        workerPartTime.addWorkerPartTime();
        arrWorkers.add(workerPartTime);
    }

    //Tính lương thấp hơn mức trung bình
    public int avgSalary() {
        int avg = 0;
        for (int i = 0; i < arrWorkers.size(); i++) {
            if (arrWorkers.get(i) instanceof WorkerFullTime) {
                avg += arrWorkers.get(i).getSalary();
            }
        }
        return avg / arrWorkers.size();
    }

    public void showSalaryLowerThanAVG() {
        for (int i = 0; i < arrWorkers.size(); i++) {
            if (arrWorkers.get(i) instanceof WorkerFullTime) {
                if (arrWorkers.get(i).getSalary() < avgSalary()) {
                    System.out.println(arrWorkers.get(i));
                }
            }
        }
    }

    //Tổng lương phải trả cho nhân viên bán thời gian
    public void totalSalaryPartTime() {
        int total = 0;
        for (int i = 0; i < arrWorkers.size(); i++) {
            if (arrWorkers.get(i) instanceof WorkerPartTime) {
                total += arrWorkers.get(i).getSalary();
            }
        }
        System.out.println("Tông tiền phải trả cho nhân viên Part Time là: " + total);
    }

    //Săp xếp
    public void sortWorker() {
        Collections.sort(arrWorkers, new Comparator<>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else if (o1.getSalary() < o2.getSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < arrWorkers.size(); i++) {
            System.out.println(arrWorkers.get(i));
        }
    }

}
