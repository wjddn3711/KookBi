import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FMS입니다");
        while(true){
            FileManager fm = new FileManager();
            String result = "";
            System.out.println("1. 내용추가" +
                    "\n2. 내용수정" +
                    "\n3. 내용삭제" +
                    "\n4. 전체 목록보기" +
                    "\n5. 나가기");
            int choice = sc.nextInt();
            String newData="";
            if(choice==5){
                System.out.println("안녕히가세요");
                break;
            }
            switch(choice){
                case 1:
                    System.out.print("추가할 데이터 : ");
                    newData = sc.next();
                    if(fm.insert(newData)){
                        System.out.println("내용 추가가 완료 됬습니다!\n추가된 데이터: "+newData);
                    }
                    else{
                        System.out.println("내용추가가 실패하였습니다");
                    }
                    break;
                case 2:
                    while(true){
                        System.out.println("어떤 데이터를 수정하시겠습니까?");
                        System.out.print("수정할 데이터 : ");
                        String data = sc.next();
                        System.out.print("새로운 데이터 : ");
                        newData = sc.next();
                        if(fm.isNoData(data)){
                            System.out.println("해당 데이터는 존재하지 않습니다");
                        }
                        else{
                            result= fm.update(data,newData);
                            break;
                        }
                    }
                    if(result!=null){
                        System.out.println("--------lang.txt ---------");
                        if(result.equals("")){
                            System.out.println("내용없음");
                        }
                        else{
                            System.out.println(result);
                        }
                        System.out.println("---------------------------");

                    }
                    else{
                        System.out.println("수정 실패");
                    }

                    break;
                case 3:
                    while(true){
                        System.out.print("어떤 내용을 삭제 하시겠습니까 : ");
                        newData = sc.next();
                        if(fm.isNoData(newData)){
                            System.out.println("해당 데이터는 존재하지 않습니다");
                        }
                        else{
                            result= fm.delete(newData);
                            break;
                        }
                    }
                    if(result!=null){
                        System.out.println("--------lang.txt ---------");
                        if(result.equals("")){
                            System.out.println("내용없음");
                        }
                        else{
                            System.out.println(result);
                        }
                        System.out.println("---------------------------");

                    }
                    else{
                        System.out.println("삭제 실패");
                    }
                    break;
                case 4:
                    result = fm.selectAll();
                    if(result==null){
                        System.out.println("현재 내용이 없습니다!!");
                    }
                    else{
                        System.out.println("--------lang.txt ---------");
                        if(result.equals("")){
                            System.out.println("");
                        }
                        else{
                            System.out.println(result);
                        }
                        System.out.println("---------------------------");
                    }
                    break;
            }
        }
    }
}
