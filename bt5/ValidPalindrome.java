package bt5;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        // code sv
        if (s.isEmpty()) {
        	return true;
        }
        s = s.replaceAll("[-+.^:@,/#_\\{\\}\"\"\\\\(\\)\'\'\\[\\]\\?;!\\`]"," ");
        String[] s2 = s.toLowerCase().split(" ");
        String s4 = "" ;
        for (String w : s2) {
            s4 = s4+w;
        }
        StringBuffer buffer = new StringBuffer(s4);
        if(s4.equals(buffer.reverse().toString())){
            return true;
        }
        return false;

        // code clean
        // if (s.isEmpty()) {
        // 	return true;
        // }
        // int start = 0;
        // int last = s.length() - 1;
        // while(start <= last) {
        // 	char currFirst = s.charAt(start);
        // 	char currLast = s.charAt(last);
        // 	if (!Character.isLetterOrDigit(currFirst )) {
        // 		start++;
        // 	} else if(!Character.isLetterOrDigit(currLast)) {
        // 		last--;
        // 	} else {
        // 		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        // 			return false;
        // 		}
        // 		start++;
        // 		last--;
        // 	}
        // }
        // return true;
    }
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(isPalindrome(s));
    }
}
