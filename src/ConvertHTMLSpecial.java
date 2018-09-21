public class ConvertHTMLSpecial {

//https://www.degraeve.com/reference/specialcharacters.php
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"\n" +
                "<objects_request>\n" +
                "\t<object_type>vpts_connection_type</object_type>\n" +
                "\t<properties count=\"2\">\n" +
                "\t\t<property>id</property>\n" +
                "\t\t<property>name</property>\n" +
                "\t</properties>\n" +
                "\t<filter>\n" +
                "\t\t<bool_expression type=\"or\">\n" +
                "          <bool_expression type=\"e\">\n" +
                "            <operand1 type=\"property\">actual_on_sm</operand1>\n" +
                "            <operator>=</operator>\n" +
                "            <operand2 type=\"constant\">1</operand2>\n" +
                "          </bool_expression>\n" +
                "          <bool_expression type=\"e\">\n" +
                "            <operand1 type=\"property\">actual_on_cm</operand1>\n" +
                "            <operator>!=</operator>\n" +
                "            <operand2 type=\"constant\">1</operand2>\n" +
                "          </bool_expression>\n" +
                "\t\t  <bool_expression type=\"e\">\n" +
                "            <operand1 type=\"property\">actual_on_mm</operand1>\n" +
                "            <operator>!=</operator>\n" +
                "            <operand2 type=\"constant\">1</operand2>\n" +
                "          </bool_expression>\n" +
                "        </bool_expression>\n" +
                "\t</filter>\n" +
                "\t<order count=\"1\">\n" +
                "\t\t<property direction=\"asc\">name</property>\n" +
                "\t</order>\n" +
                "</objects_request>\"");



        convert(sb);
    }


    private static void convert(StringBuilder sb){

        String s1 = "\t";

        int i = sb.indexOf(s1);
        while ( i >= 0){

            sb.replace(i, i+s1.length(), s1);

            if(sb.indexOf(s1) > 0){
                i = sb.indexOf(s1);
            }else {
                i = -1;
            }
            System.out.println(sb);
        }

        System.out.println(sb);

    }

}
