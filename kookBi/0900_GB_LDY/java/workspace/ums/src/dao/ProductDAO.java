package dao;

import java.util.HashSet;

import dto.ProductDTO;

public class ProductDAO {
	DBConnection conn;
	public ProductDAO() {
		conn = new DBConnection("ProductTable.txt");
	}
	public int getLastNum() {
		String lastPK = conn.lastPK();
		if(lastPK == null) {
			return 0;
		}
		else {
			return Integer.parseInt(lastPK);
		}
	}
	public boolean addProduct(ProductDTO newProduct) {
		return conn.insert(newProduct.toString());
	}
	public String getList(String userid) {
		HashSet<String> rs = conn.select(6, userid);
		String result = "";
		for(String line : rs) {
			String[] datas = line.split("\t");
			result += String.format("%s. %s : %s��(��� : %s��)\n",
					datas[0],datas[1],datas[2],datas[3]);
		}
		return result;
	}
	public boolean removeProduct(int prodnum) {
		return conn.delete(prodnum+"");
	}
	public boolean modifyProduct(int prodnum, int choice, String newData) {
		return conn.update(prodnum+"", choice+1, newData);
	}
}












