package UserInterface.ManagerAirliners;

public class FormatConvert {
    public static boolean isLetterOrNumber(String str){
        String regx = "^[a-zA-Z0-9\\s]+$";
        return str.matches(regx);
    }

    public static boolean inLetter(String str){
        String regx = "^[a-zA-Z\\s]+$";
        return str.matches(regx);
    }
}
