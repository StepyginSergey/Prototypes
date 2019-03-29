public class StringBuilderTest {

    public static void main(String[] args) {

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
