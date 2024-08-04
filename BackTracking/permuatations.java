public class permuatations {
    public static void findPermutations(String str,String ans){
        // base case
        if (str.length()==0) {
            System.err.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => to remove c "ab"+"de" ="abde"
           String Newstr= str.substring(0, i)+str.substring(i+1) ;
           findPermutations(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        findPermutations(str, "");
    }
}
