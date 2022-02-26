package Programs.Greedy;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NMeetingsInARoomQ1StriverSheet {

    public static int maxMeetings(int start[], int end[], int n)
    {
        int result =0;
        List<meetings> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            list.add(new meetings(start[i], end[i], i+1));
        }
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                meetings meetings1 =(meetings) o1;
//                meetings meetings2 =(meetings) o2;
//
//                if (meetings1.lastTime>meetings2.lastTime) return 1;
//                else if (meetings1.lastTime<meetings2.lastTime) return -1;
//                else return 0;
//            }
//        };
        Comparator comparator1 = new MeetingsCompretor();
        Collections.sort(list, comparator1);

        answer.add(list.get(0).postion);
        int limit = list.get(0).lastTime;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startTime>limit){
                limit = list.get(i).lastTime;
                answer.add(list.get(i).postion);
            }
        }
        result = answer.size();


        return result;
    }

}

class MeetingsCompretor implements Comparator<meetings>{

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }

    @Override
    public int compare(meetings meetings1, meetings meetings2) {
        if (meetings1.lastTime>meetings2.lastTime) return 1;
        else if (meetings1.lastTime<meetings2.lastTime) return -1;
        else return 0;    }
}

class meetings {
    int startTime;
    int lastTime;
    int postion;
    meetings(int startTime, int lastTime, int postion){
        this.startTime = startTime;
        this.lastTime = lastTime;
        this.postion = postion;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        meetings meetings1 =(meetings) o1;
//        meetings meetings2 =(meetings) o2;
//
//        if (meetings1.lastTime>meetings2.lastTime) return 1;
//        else if (meetings1.lastTime<meetings2.lastTime) return -1;
//        else return 0;
//    }


//    public int compareTo(@NotNull meetings that) {
//        if (this.lastTime > that.lastTime) return 1;
//        if (this.lastTime< that.lastTime) return -1;
//        else return 0;
//    }
}


