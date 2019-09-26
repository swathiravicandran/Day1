package org.test;

import org.greens.first.company;

public class Client extends company {
	public void clientId() {
		System.out.println("Client Id is 333");
	}

	public void clientName() {
		System.out.println("Client Name is SWATHY");
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.clientId();
		c.clientName();
		c.comNmae();
		c.comId();
		c.empId();
		c.empName();

	}

}
