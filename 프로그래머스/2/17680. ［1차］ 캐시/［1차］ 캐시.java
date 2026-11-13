import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        for(String target : cities){
            target = target.toLowerCase();
            if(cache.contains(target)){
                cache.remove(target);
                cache.addLast(target);
                answer++;
            }
            else{
                if(cache.size() < cacheSize){
                    cache.addLast(target);
                }
                else if(cache.size() == cacheSize && cacheSize > 0){
                    cache.pollFirst();
                    cache.addLast(target);
                }
                
                answer += 5;
            }
        }
        return answer;
    }
}
/*
Jeju", "Pangyo", "Seoul    + 15 
Pangyo", "Seoul", "Jeju"   + 1
"Seoul", "Jeju", "Pangyo"  + 1
"Jeju", "Pangyo", "Seoul"  + 1
"Pangyo", "Seoul", "Jeju"  + 1
"Seoul", "Jeju", "Pangyo"  + 1
                           + 1
                           -> 21 

*/