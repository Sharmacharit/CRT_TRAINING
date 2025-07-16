import java.util.*;
class Patient1{
    String name;
    int priority;
    Patient1(String name,int priority){
        this.name = name;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return name + " (" + priority + ")";
    }
}
public class PatientPriority {
    public static void main(String[] args) {
        String[] name = {"Rahul","Anu","John"};
        int[] priority = {5,2,3};
        PriorityQueue<Patient1> que1 = new PriorityQueue<>((a,b)->a.priority-b.priority);
        for(int i = 0;i<name.length;i++){
            que1.add(new Patient1(name[i],priority[i]));
        }
        while(!que1.isEmpty()){
            System.out.println(que1.poll());
        }
    }
}
