// Optimal solution
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; 
        int j =  s.length()-1;

        while(i<j){

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }


            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}


// Not an optimal solution  
class Solution1 {
    public boolean isPalindrome(String s) {
        String ns =  removeNonAlphaNumericChar(s);
        ns = ns.toLowerCase();
        int start = 0;
        int end = ns.length()-1;


        while (start<end){
            if(ns.charAt(start)!= ns.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public String removeNonAlphaNumericChar(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","");
        return s;
    }
}