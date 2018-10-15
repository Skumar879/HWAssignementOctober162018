public class TwoStringMethods {
    public static boolean abcTest(String text){
        String test = "abc";
        String check = ".abc";

        if(text.contains(test)){
            if(text.contains(check))return false;
            return true;
        }

        return false;
    }

    public static String alternateStrings(String str1, String str2){
        String output = "";
        String arraystring;
        if(str1.length() > str2.length()) arraystring = str1;
        else arraystring = str2;

        for (int i = 0; i < arraystring.length(); i++) {
            if(str1.length() > i) output += str1.substring(i, i+1);

            if(str2.length() > i) output += str2.substring(i, i+1);

        }

        return output;
    }
}
