package PracticeMVC;

public class Worker {
    private String workerCode;
    private String name;
    private String email;
    private String address;

    public Worker(String workerCode, String name, String email, String address) {
        this.workerCode = workerCode;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerCode='" + workerCode + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Worker worker = (Worker) o;
//        return Integer.parseInt(this.workerCode) - Integer.parseInt(((Worker) o).getWorkerCode());
//    }
}
