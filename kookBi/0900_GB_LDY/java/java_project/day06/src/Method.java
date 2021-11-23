public class Method {

    public static void main(String[] args) {
        System.out.println(toKor(107474));
    }
    //1~10 출력하는 메서드
    static void printNum(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }
    //1~10 총합 구해주는 메서드
    static int sumNum(){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i+1;
        }
        return sum;
    }
    // 1~n 총 합 구해주는 메서드
    static int perticSum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=i+1;
        }
        return sum;
    }
    // 두정수의 나눗셈 결과를 구해주는 메서드
    static int getDivided(int num1, int num2){
        return num1/num2;
    }
    // 어떤 문자열을 n번 만큼 출력하는 메서드
    static void printString(String msg, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
    // n~m 총 합 구해주는 메서드
    static int getBoundSum(int n, int m){
        if(m<n){ // 최대값이 다르다면 바꿔준다
            int temp;
            temp=n;
            n=m;
            m=n;
        }
        else if (n==m) return n; // 둘다 같은 수라면 n~m의 합은 n
        int sum =0;
        for (int i = n; i <= m; i++) {
            sum+=i;
        }
        return sum;
    }
    // 문자열을 전부 대문자로 바꿔주는 메서드
    static String getUpper(String msg){
        return msg.toUpperCase();
    }
    // 문자열을 거꾸로 바꿔주는 메서드
    static String reversedString(String msg){
        String result="";
        for (int i = msg.length()-1; i >= 0; i--) {
            result+=msg.charAt(i);
        }
        return result;
    }
    // 문자열이 숫자로 이루어져 있는지 검사하는 메서드
    static boolean isDigit(String target){
        boolean result = true;
        for (int i = 0; i < target.length(); i++) {
            if (Character.isDigit(target.charAt(i))==false){
                result = false;
                break;
            }
        }
        return result;
    }
    // 문자열의 소문자는 대문자로, 대문자는 소문자로, 나머지는 그대로 바꿔주는 메서드
    static String reversedCase (String target){
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if(c>=65 && c<=90){ //대 -> 소
                target =target.substring(0,i)+(char)(c+32)+target.substring(i+1,target.length());
            }
            else if(c>=97 && c<=122){//소-> 대
                target =target.substring(0,i)+(char)(c-32)+target.substring(i+1,target.length());
            }
            else{
                continue; // 문자가 아니라면 무시
            }
        }
        return target;
    }
    // 정수를 한글로 바꿔주는 메서드
    static String toKor (int num){
        char[] koNum = {'공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
        String result ="";
        while(num>0){
            result=koNum[num%10]+result;
            num/=10;
        }
        return result;
    }


}
