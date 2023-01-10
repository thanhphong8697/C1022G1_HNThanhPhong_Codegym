package PracticeMVC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IWorkerRepo implements InterRepo {
    static List<Worker> workerList = new ArrayList<>();

    @Override
    public void display() {
        List<Worker> workerList1 = ReadAndWrite.readWorker();
        for (Worker worker : workerList1) {
            System.out.println(worker);
        }
    }

    @Override
    public void add(Worker worker) {
        workerList.clear();
        workerList.add(worker);
        ReadAndWrite.writeWorkerAppend(workerList);
    }

    @Override
    public void search(String string) {
        workerList = ReadAndWrite.readWorker();
        for (Worker worker : workerList) {
            if (worker.getName().contains(string)) {
                System.out.println(worker);
            }
        }
    }

    @Override
    public void delete(String string) {
        List<Worker> workerList1 = ReadAndWrite.readWorker();
        for (int i = 0; i < workerList1.size(); i++) {
            if (workerList1.get(i).getWorkerCode().equals(string)) {
                workerList1.remove(workerList1.get(i));
            }
        }
        ReadAndWrite.writeWorker(workerList1);
    }

    @Override
    public void sort() {
        List<Worker> workerList1 = ReadAndWrite.readWorker();
//        Collections.sort(workerList1);
//        ReadAndWrite.writeWorker(workerList1);
        Collections.sort(workerList1, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return Integer.parseInt(o1.getWorkerCode()) - Integer.parseInt(o2.getWorkerCode());
            }
        });
        ReadAndWrite.writeWorker(workerList1);
    }

    @Override
    public void change(Worker worker) {
        List<Worker> workerList1 = ReadAndWrite.readWorker();
        for (int i = 0; i < workerList1.size(); i++) {
            if (workerList1.get(i).getWorkerCode().equals(worker.getWorkerCode())){
                workerList1.set(i,worker);
                break;
            }
        }
        ReadAndWrite.writeWorker(workerList1);
    }

    @Override
    public Worker findId(String string) {
        List<Worker> workerList1 = ReadAndWrite.readWorker();
        for (Worker worker : workerList1){
            if (worker.getWorkerCode().equals(string)){
                return worker;
            }
        }
        return null;
    }
}
