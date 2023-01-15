package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-15 18:17
 */
public class UserDao {

    private static Map<String,String> hashMap = new HashMap<>();

    {
        hashMap.put("10001","萧瑟");
        hashMap.put("10002","无心");
        hashMap.put("10003","雷无桀");
    }

    public String queryUserName(String name){
       return hashMap.get(name);
    }
}
