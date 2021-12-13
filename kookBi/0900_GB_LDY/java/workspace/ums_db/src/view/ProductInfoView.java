package view;

import java.util.Scanner;

import dao.ProductDAO;
import dto.ProductDTO;

public class ProductInfoView {
	public ProductInfoView(int prodnum) {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		ProductDTO product = pdao.get(prodnum);
		if(product == null) {
			System.out.println("�߸��� �������Դϴ� / ������ �ٽ� �õ��� �ּ���.");
		}else {
			while(true) {
				product = pdao.get(prodnum);
				System.out.println("===============================");
				System.out.println("��ǰ�� : "+product.prodname);
				System.out.println("�ø��� : "+product.userid+"\t�� : "+product.likecnt);
				System.out.println("���� : "+product.prodprice+"��");
				System.out.println("���� ���� : "+product.prodamount);
				System.out.println("�󼼼���\n"+product.prodinfo);
				System.out.println("===============================");
				System.out.println("1. ���ƿ� ������\n2. �����ϱ�\n3. �ڷΰ���");
				int choice = sc.nextInt();
				if(choice == 1) {
					//���ƿ� ������ ����(�����ִ� ��ǰ�� ��ȣ �ѱ��)
					if(pdao.updateLikeCnt(prodnum)) {
						System.out.println("���ƿ�~��");
						
					}
					else {
						System.out.println("���ƿ� ������ ���� / ������ �ٽ� �õ��� �ּ���.");
					}
				}
				else if(choice == 3) {
					break;
				}
			}
		}
	}
}




