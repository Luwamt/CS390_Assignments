package w1l2.CS390_Assignments.w1l4;

public class MinimumCharacter {
    public static char minimum(String s) {
        if (s.length() == 0 || s.equals("")) {
            return 0;
        }
            char c = s.charAt(0);
            if(s.length()== 1)
                return c;
            else
                if (c < minimum(s.substring(1)))
                    return c;
        return  minimum(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(minimum(""));
    }

    }

