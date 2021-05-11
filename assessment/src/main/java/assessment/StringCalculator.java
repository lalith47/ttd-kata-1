package assessment;

public class StringCalculator {

    public int add(String str) {
        if(str.isEmpty()){
            return 0;
        }else if(str.length() == 1){
            return Integer.valueOf(str);
        }else{
            String[] strArr = str.split(",");
           return Integer.valueOf(strArr[0]) + Integer.valueOf(strArr[1]);
        }
        
    }

}
