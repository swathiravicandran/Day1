package org.greens.first;

import org.test.Client;

public class company extends Employee {
	public void comId() {
		System.out.println("comp id is 1244");
	}

	public void comNmae() {
		System.out.println("comp name is Cts");
	}

	public static void main(String[] args) {
		company c = new company();
		c.comId();
		c.comNmae();
		Employee e = new Employee();
		e.empId();
		e.empName();
		Client t = new Client();
		t.clientId();
		t.clientName();

	}
}
