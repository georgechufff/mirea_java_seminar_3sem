import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    Queue<Integer> fp, sp;

    public Game(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for (int i = 0; i < 5; i++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count < 106){
            if(fp.peek() > sp.peek() && sp.peek() != 0){
                fp.add(sp.remove());

            }else{
                sp.add(fp.remove());
            }
            count++;
        }
        String res = "";
        if(sp.isEmpty())
            res += "second ";
        else if (fp.isEmpty())
            res += "first ";
        res += count;
        if(count == 106)
            res += " botva";
        return res;
    }
}