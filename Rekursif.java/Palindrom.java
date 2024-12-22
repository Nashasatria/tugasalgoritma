public class Palindrom {
    public static boolean Palindrom(String str, int start, int end) {
        if (start>=end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return Palindrom(str, start+1, end-1);
    }
public static void main(String[] args) {
    String str ="sus";
    Palindrom p = new Palindrom();
    boolean result = p.Palindrom(str, 0, str.length() -1);
    if (result) {
        System.out.println(str+" :Adalah Palindrom");
    }else{
        System.out.println(str+" :Bukan Palindrom");
            }
        }
    }