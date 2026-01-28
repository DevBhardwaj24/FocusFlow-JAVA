import java.util.*;


class Task{
    int taskID;
    String taskDesc;

    Task(int taskID,String taskDesc){
        this.taskID=taskID;
        this.taskDesc =taskDesc;
    }
}

class TaskManager{

    List<Task> tasks=new ArrayList<>();
    int count=1;


    void addTask(String taskDesc) {
        Task t = new Task(count, taskDesc);
        tasks.add(t);
        count++;
    }


    List<Task> displayTask(){
        return tasks;

    }
}

class Menu{
    TaskManager manager;
    Scanner sc=new Scanner(System.in);

    public Menu(TaskManager manager){
        this.manager=manager;
    }

    void start(){
        while(true){
            System.out.println("=== To Do App ===");
            System.out.println("Enter your choice :");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Exit");
            int choice=sc.nextInt();

            if(choice==1){
                sc.nextLine();
                System.out.print("Enter the Task Description: ");
                String desc=sc.nextLine();
                manager.addTask(desc);
                System.out.println("Your task added successfully. ");
            } else if (choice==2) {
                for(Task t: manager.displayTask()){
                    System.out.println(t.taskID+" - "+ t.taskDesc);
                }

            }else{
                break;
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {
        TaskManager manager=new TaskManager();
        Menu menu=new Menu(manager);
        menu.start();




    }
}