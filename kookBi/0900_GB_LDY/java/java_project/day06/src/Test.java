public class Test {
    public static void main(String[] args) {
        String data = "안녕 나는 정우";
        String[] datas = data.split(" ");
        for (int i = 0; i < datas.length; i++) {
            if(datas[i].equals("나는")){
                datas[i] = "x";
            }
        }
        String[] dDatas = new String[datas.length-1];
        int index =0;
        for (int i = 0; i < datas.length; i++) {
            if(datas[i].equals("x")){
                continue;
            }
            else{
                dDatas[index] = datas[i];
                index++;
            }
        }
        datas = dDatas;
        for (String s : datas) {
            System.out.println(s);
        }
        String list = String.join(" ",datas);
        System.out.println(list);
    }
}
