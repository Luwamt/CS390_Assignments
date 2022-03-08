package w1l2.CS390_Assignments.w3l8.prob3;

import java.util.ArrayList;
import java.util.List;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

@Override
public boolean equals(Object ob) {
	if (ob == null) return false;
	if (this == ob) return true;
	if (!(ob instanceof Marketing)) return false;
	Marketing market = (Marketing) ob;
	if (this.salesamount == market.salesamount)
		return true;
	return false;
}
	/*@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (this == ob) return true;
		if (!(ob instanceof Marketing)) return false;
		Marketing market = (Marketing) ob;
		if (this.employeename.equalsIgnoreCase(market.employeename) &&
				this.productname.equalsIgnoreCase(((Marketing) ob).productname) &&
				this.salesamount == ((Marketing) ob).salesamount)
			return true;
		return false;
}*/

	@Override
	public String toString() {

		return employeename + " " + productname + " " + salesamount;
	}

}