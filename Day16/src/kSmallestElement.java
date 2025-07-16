import java.util.*;
public class kSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int i = 0;
        while(i<arr.length){
            que.add(arr[i]);
            i++;
        }
        System.out.println(que);
        int j = 0;
        while(!que.isEmpty()){
            if(j!=k){
                que.poll();
            }
            else {
                System.out.println(que.poll());
                break;
            }
            j++;
        }
    }
}
