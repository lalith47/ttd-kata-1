package assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringCalculator {

    /**
     *
     */
    private static final String DEFAULT_SEPERATOR = ",";

    private int add(String str,String seperator){
        str = str.replace("\n", seperator);
        StringBuilder sb = new StringBuilder("[").append(seperator).append("]");
        String[] strArr = str.split(sb.toString());
        List<String> strList = Arrays.asList(strArr);
        Integer numList = strList.stream()
                .mapToInt(e -> Integer.valueOf(e))
                .sum();
        return numList;
    } 

    public int add(String str) {
        if(str.startsWith("//")){
            String seperator = str.substring(2, 3);
            str = str.substring(4);
            return add(str,seperator);
        }
        if(str.isEmpty()){
            return 0;
        }else {
            return add(str, DEFAULT_SEPERATOR);
        }
        
        
    }

}
