
package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histograma =new Histogram(4,3,8,-1,3,1,1,2,5,4,8,1);
        for (int value : histograma.getValue()) {
            System.out.println(value + " " + histograma.getCount(value));
        }
    }
    
}
