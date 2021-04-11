public class MainException {
    public static boolean verifyEquation(String equation) throws Exception {
        int count = 0;

        for (char chr : equation.toCharArray()) {
            if (chr == '(')
                count++;

            else if (chr == ')')
                count--;
        }

        if (count < 0)
            throw new Exception("Incomplete equation, missing starting brackets");

        else if (count > 0)
            throw new Exception("Incomplete equation, missing ending bracket(s)");


        return count == 0;
    }
    public static void main(String[] args) {
        String eq1 = "(12 + 10 - (24 * 11)) / 100";
        String eq2 = "(12 + 10 - (24 * 11) / 100";

        try {            
            System.out.println(verifyEquation(eq1));
            System.out.println(verifyEquation(eq2));
        } catch (Exception e) {
            System.err.println(e);
        }
    }    
}
