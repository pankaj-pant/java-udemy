public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third){
        if(isTeen(first) || isTeen(second) || isTeen(third)){
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int test){
        if (test >= 13 && test <= 19){
            return true;
        } else {
            return false;
        }
    }
}
