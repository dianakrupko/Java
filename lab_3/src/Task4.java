import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("К-ть: " + args.length);
        FReal(args);
        FInteger(args);
        FCharacter(args);
        FString(args);
        FIdentifier(args);
    }
    public static String FReal(String[] args){
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].matches("\\d+\\.\\d+")) {
                System.out.println("[" + i + "]" + args[i] + " - Real");
            }
        }
    return "Real";
    }
    public static String FInteger(String[] args){
        for (int i = 0; i <= args.length - 1; i++) {
            if(args[i].matches("\\d+")) {
                System.out.println("[" + i + "]" + args[i] + " - Integer");
            }
        }
        return "Integer";
    }
    public static String FCharacter(String[] args){
        for (int i = 0; i <= args.length - 1; i++) {
            if(args[i].matches("'\\w?'")) {
                System.out.println("[" + i + "]" + args[i] + " - Character");
            }
        }
        return "Character";
    }
    public static String FString(String[] args){
        for (int i = 0; i <= args.length - 1; i++) {
            if(args[i].matches("^[\"]*[a-z]*[\"]*$")) {
                System.out.println("[" + i + "]" + args[i] + " - String");
            }
        }
        return "String";
    }
    public static String FIdentifier(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].matches("^[^(a-zA-z)|^(0-9)]*")) {
                System.out.println("[" + i + "]" + args[i] + " - Identifier\"");
            }
        }
        return "Identifier";
    }
}