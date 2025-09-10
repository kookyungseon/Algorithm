class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        
        int max =0;
        
        int sum =0;
        
        for(int i =0; i <sides.length; i++){
            
            sum = sum + sides[i];
            
            if(max < sides[i]){
                
                max = sides[i];
            }  
        }
        
        int others = sum - max;
        
//         for(int j =0; j <sides.length; j++){
//             if(sides[j] != max){
                
//                 sum = sum +sides[j];
//             }
//         }
        
        if(others>max){
            answer = 1;
        }else{
            answer =2;
        }
        
        return answer;
    }
}