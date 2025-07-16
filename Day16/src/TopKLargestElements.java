import java.util.*;
public class TopKLargestElements {
    public static void main(String[] args) {
        int[] arr = {5,20,3,100,11,70};
        int k = 3;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int i = 0;
        while(i<arr.length){
            que.add(arr[i]);
            i++;
        }
        int j = 0;
        while(!que.isEmpty()){
            if(j<(arr.length-k)){
                que.poll();
            }
            else {
                System.out.println(que.poll());
            }
            j++;
        }
    }
}
