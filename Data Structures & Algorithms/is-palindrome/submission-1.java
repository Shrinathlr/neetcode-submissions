class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        int left =0;
        int right = str.length()-1;
        while(left<=right)
        {
            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
return true;
    }
}

