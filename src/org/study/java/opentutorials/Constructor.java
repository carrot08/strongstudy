package org.study.java.opentutorials;

public class Constructor {

	public static void main(String[] args) {
		CaculatorV2 c1 = new CaculatorV2(2,1);
		c1.sum();
		c1.avg();
		
		c1.setOprands(20, 10);
		c1.sum();
		c1.avg();

	}
}




class CaculatorV2 {

	int left = 0;
	int right = 0;
	
	public CaculatorV2(int left, int right) {
		this.setOprands(left, right);
	}
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		 System.out.println(this.left + this.right);
	}
	public void avg() {
		 System.out.println(this.left / this.right);
	}

}
