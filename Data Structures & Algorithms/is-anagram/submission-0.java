class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char n : s.toCharArray()){
            if(map1.containsKey(n))
            {
                map1.put(n, map1.get(n)+1);
            }
            else{
                map1.put(n,1);
            }
        }

         for(char m : t.toCharArray()){
            if(map2.containsKey(m))
            {
                map2.put(m, map2.get(m)+1);
            }
            else{
                map2.put(m,1);
            }
        }

        if(map1.equals(map2))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
