package com.mycompany.adapterexemplo;

public class AdapterExemplo {

    public static void main(String[] args) {
        
        JsonParser jsonParser = new JsonParser();
        
        XmlParser adapter = new XmlToJsonAdapter(jsonParser);
        
        adapter.parseXml("<data>123</data>");
    }
}
