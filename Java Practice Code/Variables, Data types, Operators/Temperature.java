public class Temperature {
    public static void main(String[] args) {
        double celsius = 37.0;
        double farenheit ;

        farenheit = celsius * 9/5 + 32;
        System.out.println(farenheit);

        double far = 101;
        double cel = (far - 32)* 5/9;
        System.out.println(cel);
    }
}
