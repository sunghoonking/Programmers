class Solution {
    public int[] solution(int[] num_list) {
            int[] answer = {};
        
        answer = new int[num_list.length];
        int w = 0;
        for(int i= num_list.length-1; i >= 0 ;i--){
            if(w == num_list.length){
                  break;
            }
            int a = num_list[i];
            answer[w] = a;
            
             w++;
          } 
    
       
        
        
        return answer;
    }
}