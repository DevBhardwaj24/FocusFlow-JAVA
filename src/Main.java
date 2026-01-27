//Task 1: is to define the class i want
// the feature i want are taskID and task desc.

//Task 2 is to make a Task manager class to handle all that stuff

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


    // need to make a list of task. that contains id and desc. of task
    List<Task> tasks=new ArrayList<>();

    // fun to add the task
    void addTask(int taskID,String taskDesc){
        tasks.add(new Task(taskID,taskDesc));
    }

    // to display all the task
    List<Task> displayTask(){
        return tasks;

    }
}


public class Main {
    public static void main(String[] args) {
        TaskManager manager=new TaskManager();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("=== To Do App ===");
            System.out.println("Enter your choice :");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Exit");
            int choice=sc.nextInt();

            if(choice==1){
                System.out.print("Enter the Task ID: ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Task Description: ");
                String desc=sc.nextLine();
                manager.addTask(id,desc);
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