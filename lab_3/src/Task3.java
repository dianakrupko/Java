public class Task3 {
    public static void main(String[] args) {
        System.out.println("К-ть: " + args.length);
        FKeyword(args);
        FIndentifier(args);
        FIllegal(args);
    }

    public static String FKeyword(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].matches("if")) {
                System.out.println("[" + i + "]" + args[i] + " - Keyword");
            } else if (args[i].matches("for")) {
                System.out.println("[" + i + "]" + args[i] + " - Keyword");
            } else if (args[i].matches("while")) {
                System.out.println("[" + i + "]" + args[i] + " - Keyword");
            } else if (args[i].matches("do")) {
                System.out.println("[" + i + "]" + args[i] + " - Keyword");
            } else if (args[i].matches("else")) {
                System.out.println("[" + i + "]" + args[i] + " - Keyword");
            }
        }
        return "Keyword";
    }

    public static String FIndentifier(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].matches("[(0-9)||(a-z)||[_]||[$]]*")) {
                System.out.println("[" + i + "]" + args[i] + " - Indentifier");
            }
        }
        return "Indentifier";
    }

    public static String FIllegal(String[] args) {
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].matches("^[^(a-zA-z)|^(0-9)]*")) {
                System.out.println("[" + i + "]" + args[i] + " - Illegal\"");
            }
        }
        return "Illegal";
    }
}