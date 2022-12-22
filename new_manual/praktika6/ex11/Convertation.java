public class Convertation implements Convertable{
    @Override
    public double convert(double value, String type) {
        if (type == "K"){
            value += 273;
        }
        else if (type == "F"){
            value = value * 1.8 + 32;
        }
        return value;
    }
}
