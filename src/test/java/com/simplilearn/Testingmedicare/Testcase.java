package com.simplilearn.Testingmedicare;

import org.testng.annotations.Test;

public class Testcase {
	
	public class test1 extends homepage{
		@Test(priority = 1)
		public void home()throws InterruptedException {
			
			homepage obj = new test1();
			obj.page();
		}
		
	}
	
	public class test2 extends userregister{
		
		@Test(priority = 2)
		public void register()throws InterruptedException {
			
			userregister obj = new test2();
			obj.register1();
		}
		
	}
	
public class test3 extends suplierregister{
		
		@Test(priority = 3)
		public void registersup()throws InterruptedException {
			
			suplierregister obj = new test3();
			obj.register2();
		}
		
	}

public class test4 extends loginuser{
	
	@Test(priority = 4)
	public void login()throws InterruptedException {
		
		loginuser obj = new test4();
		obj.loginuse();
	}
	
}

public class test5 extends viewproducts{
	
	@Test(priority = 5)
	public void view()throws InterruptedException {
		
		viewproducts obj = new test5();
		obj.products();
	}
	
}

public class test6 extends addtocart{
	
	@Test(priority = 6)
	public void cart()throws InterruptedException {
		
		addtocart obj = new test6();
		obj.added();
	}
	
}


}
