import com.jayway.jsonpath.JsonPath;

public class app {

    public static void main(String[] args) {
        String Jsonobject="{\n" +
                "   \"policyNumber\":\"A1234567\",\n" +
                "   \"policyStatusCode\":\"22\",\n" +
                "   \"policyStatus\":\"active\",\n" +
                "   \"fundResults\":[\n" +
                "      {\n" +
                "         \"fundDetails\":[\n" +
                "            {\n" +
                "               \"fundName\":\"fund1\",\n" +
                "               \"fundDescription\":\"description1\",\n" +
                "               \"fundCode\":\"var1\"\n" +
                "            }\n" +
                "         ],\n" +
                "         \"unitBalance\":\"1000.00\",\n" +
                "         \"unitValue\":\"25.00\",\n" +
                "         \"fundBalance\":\"25000.00\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"fundDetails\":[\n" +
                "            {\n" +
                "               \"fundName\":\"fund2\",\n" +
                "               \"fundDescription\":\"description2\",\n" +
                "               \"fundCode\":\"var2\"\n" +
                "            }\n" +
                "         ],\n" +
                "         \"unitBalance\":\"5000.00\",\n" +
                "         \"unitValue\":\"2.00\",\n" +
                "         \"fundBalance\":\"10000.00\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";
        Object dataObject = JsonPath.parse(Jsonobject).read("$.fundResults[*].fundDetails[?(@.fundName =='fund1')]");
        String dataString = dataObject.toString();
        System.out.println(dataString);
    }
}
