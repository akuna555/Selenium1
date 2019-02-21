package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Config {
    private static Properties pro;
    static {
        String path ="configurations.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            pro  = new Properties();
            pro.load(file);
            file.close();

        }catch (Exception e){
            System.out.println("Path: "+ path+ "  - not found.");


        }
    }
    public static String getProperty(String key){
        return pro.getProperty(key);
    }

    public static void main(String[] args) {
        String s = pro.getProperty("name");
        System.out.println(s);
    }
}
