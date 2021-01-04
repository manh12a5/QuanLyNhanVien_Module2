import Worker.WorkerFullTime;
import Worker.WorkerPartTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerWorker {

    //Danh sách thuộc tính
    List<WorkerFullTime> arrWorkerFullTime = new ArrayList<>();
    List<WorkerPartTime> arrWorkerPartTime = new ArrayList<>();

    //Danh sách phương thức
    public void addNewWorkerFullTime() {
        WorkerFullTime workerFullTime = new WorkerFullTime();
        workerFullTime.addWorkerFullTime();
        arrWorkerFullTime.add(workerFullTime);
    }

    public void addNewWorkerPartTime() {
        WorkerPartTime workerPartTime = new WorkerPartTime();
        workerPartTime.addWorkerPartTime();
        arrWorkerPartTime.add(workerPartTime);
    }

    public void averageSalaryFullTime() {
        byte count = 0;
        for (int i = 0; i < arrWorkerFullTime.size(); i++) {
            if (arrWorkerFullTime.get(i).salaryFullTime() < 8000000) {
                System.out.println(arrWorkerFullTime.get(i));
                System.out.println();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có nhân viên lương thấp hơn mức trung bình");
            System.out.println();
        }
    }

    public void totalSalaryPartTime() {
        double total = 0;
        for (int i = 0; i < arrWorkerPartTime.size(); i++) {
            total += arrWorkerPartTime.get(i).salaryPartTime();
        }
        System.out.println("Tông tiền phải trả cho nhân viên Part Time là: " + total);
        System.out.println();
    }

    public void sortWorker() {
        Collections.sort(arrWorkerFullTime, new Comparator<WorkerFullTime>() {
            @Override
            public int compare(WorkerFullTime o1, WorkerFullTime o2) {
                if (o1.salaryFullTime() < o2.salaryFullTime()) {
                    return -1;
                } else if (o1.salaryFullTime() > o2.salaryFullTime()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (int i = 0; i < arrWorkerFullTime.size(); i++) {
            System.out.println(arrWorkerFullTime.get(i));
            System.out.println();
        }
    }

}
