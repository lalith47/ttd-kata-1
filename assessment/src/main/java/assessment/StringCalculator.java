package assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String str) {
        
        if(str.isEmpty()){
            return 0;
        }else {
            str = str.replace("\n", ",");
            String[] strArr = str.split(",");
            List<String> strList = Arrays.asList(strArr);
            Integer numList = strList.stream()
                    .mapToInt(e -> Integer.valueOf(e))
                    .sum();
        return numList;
        }
        
    }

}
