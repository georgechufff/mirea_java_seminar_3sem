public class Substance implements Nameable{
    private String name;
    public Substance(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
