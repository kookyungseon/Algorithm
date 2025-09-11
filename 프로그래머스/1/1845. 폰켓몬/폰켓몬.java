import java.util.HashMap;

class Solution {
     
    public int solution(int[] nums) {
         int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
      
//        해시맵 만들기
          for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int countkey = map.size(); //서로다른 키가 몇개인지 
        int choosekey = nums.length/2;

        
        if(countkey> choosekey){
            
            answer = choosekey;
        }else {
            answer = countkey;
        }
          
        
      
        return answer;
    }
}