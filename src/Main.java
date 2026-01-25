//Task 1:

class Task {
    String description;
    boolean isDone;

    public Task(String description){
        this.description=description;
    }


}
public class Main {
    public static void main(String[] args) {
        Task t=new Task("complete this project");
        System.out.println(t);



    }
}