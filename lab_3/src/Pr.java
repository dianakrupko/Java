public class Pr {
    private static int[] ars;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        System.out.println("Количество: " + args.length);
        for (int i=0; i<=args.length-1; i++){
            if (args[i].matches("[0-9]*")){
                System.out.println("["+i+"]"+args[i]+" - число - Indentifier");
            }
            else if (args[i].matches("if")){
                System.out.println("["+i+"]"+args[i]+" - Keyword");
            }
            else if (args[i].matches("for")){
                System.out.println("["+i+"]"+args[i]+" - Keyword");
            }
            else if (args[i].matches("while")){
                System.out.println("["+i+"]"+args[i]+" - Keyword");
            }
            else if (args[i].matches("do")){
                System.out.println("["+i+"]"+args[i]+" - Keyword");
            }
            else if (args[i].matches("else")){
                System.out.println("["+i+"]"+args[i]+" - Keyword");
            }
            else if (args[i].matches("[a-z]*")){
                System.out.println("["+i+"]"+args[i]+" - слово - Indentifier");
            }
            else if (args[i].matches("_")){
                System.out.println("["+i+"]"+args[i]+" - слово - Indentifier");
            }
            else if (args[i].matches("$")) {
                System.out.println("[" + i + "]" + args[i] + " - слово - Indentifier");
            }else {
                System.out.println("["+i+"]"+args[i]+" - Illegal");}
        }
    }}