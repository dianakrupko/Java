public class StackMember {
    private String name_profram;
    private int memory;
    private int pr;
    public StackMember(String name_profram, int memory, int pr){
        this.name_profram=name_profram;
        this.memory=memory;
        this.pr=pr;
    }
    public int pr(){
        return pr;
    }
    @Override
    public String toString() {
        return name_profram + " " + memory + " " + pr+ "\t";
    }
}
