package Programs.Greedy;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        //this is a lamda expression;
        Arrays.sort(arr, (o1, o2) -> (o2.profit- o1.profit)); //for reverse order o2-o1;
        int profit = 0, noOfJobs =0;
        int maxDeadline = 0;
        for (Job i : arr) if (i.deadline > maxDeadline)maxDeadline =  i.deadline;
        int[] result = new int[2];//no
        int[] deadline = new int[maxDeadline+1];//due to constraints// or use maxdeadline +1;
        for (int i : deadline) {i=-1;}//intialised

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j >0; j--) {
                if (deadline[j] == -1){
                    deadline[j] =arr[i].id;
                    noOfJobs++;
                    profit+= arr[i].profit;
                    break;
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//           if (deadline[arr[i].deadline] == -1){
//               deadline[arr[i].deadline] = arr[i].id;
//               noOfJobs++;profit += arr[i].profit;
//           }else {
//               int deadlinePointer = arr[i].deadline;
//               while (deadlinePointer >= 0&&deadline[deadlinePointer] != -1) deadlinePointer--;
//               if(deadlinePointer <0 ) continue;
//               deadline[deadlinePointer] = arr[i].id;
//               noOfJobs += 1;profit += arr[i].profit;
//           }
//        }
        result[0] = noOfJobs; result[1] = profit;
        return result;
    }

    int[] JobSchedulingGFG(Job arr[], int n)
    {
        int sum=0,jobsdone=0;
        int deadline[]=new int [n];
        Arrays.fill(deadline,0);
        Arrays.sort(arr,(a,b)-> b.profit - a.profit);
        for(int i=0;i<n;i++)
        {
            int j=0;
            if(arr[i].deadline<n)
                j=arr[i].deadline-1;
            else
                j=n-1;
            while(j>=0)
            {
                if(deadline[j]==0)
                {
                    deadline[j]=arr[i].profit;
                    jobsdone++;
                    break;
                }
                j--;
            }
        }
        for(int profitt:deadline)
            sum+=profitt;
        int ans[]={jobsdone,sum};
        return ans;
    }

}
class Job {
    int id;
    int deadline;
    int profit;


    public Job(int id,int deadline, int profit) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}
