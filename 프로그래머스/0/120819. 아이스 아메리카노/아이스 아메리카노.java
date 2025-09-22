class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int count =0;
        int less =0;
        if(money >=5500){
            count = money/5500;
            less = money-(count*5500);
            
            answer[0] = count;
            answer[1] = less;
        }else{
            count = 0;
            less = money;
            
            answer[0] = count;
            answer[1] = less;
        }
        return answer;
    }
}