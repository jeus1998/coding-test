import java.util.*;
class Solution {
    private static int CACHE_HIT = 1;
    private static int CACHE_MISS = 5;
    private static int answer = 0;
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * CACHE_MISS;
        Deque<String> cache = new LinkedList<>();
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if(cache.contains(city)) {
                answer += CACHE_HIT;
                cache.remove(city);
                cache.addLast(city);
                continue;
            }
            answer += CACHE_MISS;
            if(cacheSize == cache.size()) {
                cache.pollFirst();
            }
            cache.addLast(city);
        }
        return answer;
    }
}