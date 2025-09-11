import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
//         해시맵 만들기
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player,0) +1);
        }
//         해시맵 배기
        for(String player : completion){
            map.put(player, map.get(player)-1);
        }
                
// 마지막 주자 
        for(String key : map.keySet()){
            
            if(map.get(key)!=0){
                answer = key;
                break;
            }
        
        }
        return answer;
    }
}