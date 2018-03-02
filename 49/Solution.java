//丑数
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0) return 0;
        int count=1;
        long result=1;
        ArrayList<Long> list=new ArrayList<>();
        list.add(2L);
        list.add(3L);
        list.add(5L);
        while (count<index){
            long num=list.remove(0);
            if (!list.contains(num*2))
                list.add(num*2);
            if (!list.contains(num*3))
                list.add(num*3);
            if (!list.contains(num*5))
                list.add(num*5);
            Collections.sort(list);
            result=num;
            count++;
        }
        return Integer.parseInt(String.valueOf(result));
    }
}
