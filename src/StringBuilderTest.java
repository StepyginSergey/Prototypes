public class StringBuilderTest {

    public static void main(String[] args) {
        //getLinkProperty();
        System.out.println(getLongString(2000));
    }

    private static String getLongString(int n){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb.toString();
    }

    private static void getLinkProperty(){
        String links = "<links><link><property name=\"object_type\">1</property><property name=\"object_id\">4697</property></link></links>";

        links = links.replace("</links>","");

        String ids = "822657";

        StringBuilder sBuilder = new StringBuilder(links);

        sBuilder.append("<link>")
                .append("<property name=\"object_type\">7</property>")
                .append("<property name=\"object_id\">").append(ids).append("</property>")
                .append("</link>")
                .append("</links>");

        System.out.println(sBuilder);

        /*sBuilder.append("<links>");

        //Организация
        sBuilder.append("<link>")
                .append("<property name=\"object_type\">1</property>")
                .append("<property name=\"object_id\">").append(emitentInfo.getOrgId()).append("</property>")
                .append("</link>");
        */
    }

}
