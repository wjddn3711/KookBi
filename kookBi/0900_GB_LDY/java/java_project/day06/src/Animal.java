public class Animal {
    String name;
    String type;
    int age;
    String sex;
    String cry;


    public Animal(String name, String type, int age, String sex) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sex = sex;
        // 생성자 호출 후 해당하는 울음 소리 지정
        switch (type){
            case "고양이": case "야옹이" :
                this.cry = "야옹";
                break;
            case "호랑이":
                this.cry = "어흥";
                break;
            case "멍멍이": case "강아지": case "개":
                this.cry = "멍멍";
                break;
            case "닭": case "치킨":
                this.cry = "꼬끼오";
                break;
            case "개미햝기":
                this.cry = "햝햝햝햝햝햝";
                break;
            default:
                this.cry = "ㄲㅣ아아아아앙";
        }
    }


    // 울기
    void crying(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.cry+" !!!!");
        }
        System.out.println(this.name+"이 울기 시작했습니다. 배가 고픈게 아닐까요?");
    }

    // 먹기
    void eat(String food){
        System.out.printf("%s 가 %s 를 먹습니다\n",this.name,food);
    }
    // 자기
    void sleep(int time){
        System.out.printf("%s 가 %d 시간 동안 잡에 듭니다.\n",this.name,time);
        try {
            for (int i = 0; i < time; i++) {
                Thread.sleep(1000);
                System.out.print("z");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n잠에서 깹니다.");
    }
    // 움직이기
    void move (int dist){
        System.out.printf("%s 가 %d km 산책에 나섭니다.\n",this.name,dist);
        System.out.println("시작!");
        try {
            for (int i = 0; i < dist; i++) {
                System.out.printf("%dkm...",i+1);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n완주 하였습니다!");
        crying(); // 완주후 울기 수행
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'';
    }
}
