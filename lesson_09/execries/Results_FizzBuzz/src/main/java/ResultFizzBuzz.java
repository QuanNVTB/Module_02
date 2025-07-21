public class ResultFizzBuzz {
    public static String fizzBuzz(int number) {
        if(isResultFizz(number)){
            return "Fizz";
        }else if(isResultBizz(number)){
            return "Buzz";
        }else if(isResultFizzBizz(number)){
            return "FizzBuzz";
        }else{
            return convertToVietNamse(number);
        }
    }

    private static boolean isResultFizzBizz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static boolean isResultBizz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }

    private static boolean isResultFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    private static String convertToVietNamse(int number) {
        if(number < 0 || number > 99){
            return "Chỉ hỗ trợ số từ 0 đến 99";
        }
        String[] units = {"không", "một","hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if(number < 10){
            return units[number ];
        }

        int tens = number / 10;
        int ones = number % 10;
        String result;
        if(tens == 1){
            result = " mười";
        }else{
            result = units[tens] + " mươi";
        }
        if(ones == 0){

        }else if(ones == 1){
            result +=" mốt";
        } else if (ones == 5) {
            result += " lăm";
        }else{
            result += " " + units[ones];
        }
        return result.trim();
    }
}
