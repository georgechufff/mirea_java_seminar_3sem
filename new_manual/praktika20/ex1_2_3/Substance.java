package ex1_3;

public class Substance {
    private String name, type;
    Substance(){
        name = "Amogus";
        type = "dolphin";
    }

    @Override
    public String toString() {
        return "Это животное принадлежит типу  " + type + ". Его имя: " + name;
    }
}