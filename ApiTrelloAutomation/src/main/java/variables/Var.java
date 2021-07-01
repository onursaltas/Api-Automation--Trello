package variables;

import config.XmlFileParse;

public class Var {

    private Var() {

    }

    public static String apiUrl = XmlFileParse.xmlFileParse("apiURL", "var.xml");
    public static String key = XmlFileParse.xmlFileParse("Key", "var.xml");
    public static String token = XmlFileParse.xmlFileParse("Token", "var.xml");



}