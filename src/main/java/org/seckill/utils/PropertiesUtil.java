package org.seckill.utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created by piaomiao on 2017/2/2.
 * 读取config.properties配置
 *
 */
public class PropertiesUtil {
   private static Properties properties = new Properties();
        static {
           InputStream inputStream = Integer.class.getResourceAsStream("/config.properties");
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    public static String get(String key) {
        String value = properties.getProperty(key);
        if(value != null){
            value = value.trim();
        }
        return value;
    }


}
