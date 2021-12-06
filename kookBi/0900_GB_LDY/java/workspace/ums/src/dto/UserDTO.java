package dto;

public class UserDTO {
//	Alt + Shift + A : 여러줄 동시에 선택해서 수정하기
	public String userid;
	public String userpw;
	public String username;
	public int userage;
	public String userphone;
	public String useraddr;
	
	public UserDTO() {;}
	
	public UserDTO(String userid, String userpw, String username, int userage, String userphone, String useraddr) {
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userage = userage;
		this.userphone = userphone;
		this.useraddr = useraddr;
	}
	
	public UserDTO(String[] datas) {
		userid = datas[0];
		userpw = datas[1];
		username = datas[2];
		userage = Integer.parseInt(datas[3]);
		userphone = datas[4];
		useraddr = datas[5];
	}
	@Override
		public String toString() {
			return userid+"\t"+userpw+"\t"+username+"\t"+userage+"\t"
					+userphone+"\t"+useraddr;
		}
	
}








