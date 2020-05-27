public class Matcher {

    public static void main(final String[] args) {
        String s1 = "AA-(RU)";
        String s2 = "AA-(RU)";

        System.out.println(s1.equals(s2));

        s1 = clearRatingValue(s1);
        s2 = clearRatingValue(s2);

        System.out.println(s1.equals(s2));

    }


    private static String clearRatingValue(final String rating_value) {
        String rv = rating_value.replace("А", "A").replace("В", "B")
                .replace("С", "C");
        return rv;
    }

}
