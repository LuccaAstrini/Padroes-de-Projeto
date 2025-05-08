package com.mycompany.adapterexemplo;

public class XmlToJsonAdapter implements XmlParser{

    private JsonParser jsonParser;

    public XmlToJsonAdapter(JsonParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    @Override
    public void parseXml(String xml) {
        //conversão
        String json = convertXmlToJson(xml);
        //Delegação ao Adaptee
        jsonParser.parseJson(json);
    }
    
    private String convertXmlToJson(String xml){
        //Remove tags XML e formata como JSON
        return "{ \"data\": \"" + xml.replaceAll("<[^>]+>", "" )+ "\"}";
    }
}
