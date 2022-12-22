package ex5;

public class Tensor{
    public static <T extends Number, V extends Number> void sum(T[][] first, V[][] second){
        if (!(first.length == second.length && first[0].length == second[0].length))
            System.out.println("Матрицы введены некорректно");
        else{
            for (int i = 0; i < first.length; ++i){
                for (int j = 0; j < first[0].length; ++j)
                    System.out.print(first[i][j].doubleValue() + second[i][j].doubleValue() + " ");
                System.out.println();
            }
        }
        System.out.println();
    }

    public static <T extends Number, V extends Number> void multiply(T[][] first, V[][] second){
        if (first.length != second[0].length)
            System.out.println("Матрицы введены некорректно");
        else{
            for (int i = 0; i < first.length; i++) {
                for(int j = 0; j < second[0].length; j++) {
                    Number cell = 0;
                    for (int k = 0; k < second.length; k++) {
                        cell = cell.doubleValue() + first[i][k].doubleValue() * second[k][j].doubleValue();
                    }
                    System.out.print(cell.doubleValue() + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Integer [][] first = {{1, 2}, {3, 4}};
        Double[][] second = {{3.1, 3.2}, {3.3, 3.4}};
        Tensor.sum(first, second);
        Tensor.multiply(first, second);
    }
}