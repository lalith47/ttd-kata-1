package assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import jdk.internal.joptsimple.internal.Strings;

public class StringCalculator {

    /**
     *
     */
    private static final String DEFAULT_SEPERATOR = ",";

    private int add(String str,String seperator) throws NegativeNumberNotAllowedException{
        str = str.replace("\n", seperator);
        StringBuilder sb = new StringBuilder("[").append(seperator).append("]");
        String[] strArr = str.split(sb.toString());
        List<String> strList = Arrays.asList(strArr);
        validate(strList);
        Integer numList = strList.stream()
                .mapToInt(e -> Integer.valueOf(e))
                .sum();
        return numList;
    }


    private void validate(List<String> strList) throws NegativeNumberNotAllowedException {
        List<String> negativeNumbers = strList.stream().filter(e -> e.contains("-")).collect(Collectors.toList());
        if(negativeNumbers.size() > 0){
            throw new NegativeNumberNotAllowedException("negatives not allowed" + String.join(DEFAULT_SEPERATOR, negativeNumbers));
        }
    } 


    public int add(String str) throws NegativeNumberNotAllowedException {
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
