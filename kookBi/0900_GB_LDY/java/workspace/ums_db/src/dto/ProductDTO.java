package dto;

public class ProductDTO {
	public int prodnum;
	public String prodname;
	public int prodprice;
	public int prodamount;
	public String prodinfo;
	public int likecnt;
	public String userid;
	
	public ProductDTO(int prodnum, String prodname, int prodprice, int prodamount, String prodinfo, String userid) {
		this.prodnum = prodnum;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.prodamount = prodamount;
		this.prodinfo = prodinfo;
		this.likecnt = 0;
		this.userid = userid;
	}
	
	public ProductDTO(String[] datas) {
		prodnum = Integer.parseInt(datas[0]);
		prodname = datas[1];
		prodprice = Integer.parseInt(datas[2]);
		prodamount = Integer.parseInt(datas[3]);
		prodinfo = datas[4];
		likecnt = Integer.parseInt(datas[5]);
		userid = datas[6];
	}

	@Override
	public String toString() {
		return prodnum+"\t"+prodname+"\t"+prodprice+"\t"+prodamount+
				"\t"+prodinfo+"\t"+likecnt+"\t"+userid;
	}
}










