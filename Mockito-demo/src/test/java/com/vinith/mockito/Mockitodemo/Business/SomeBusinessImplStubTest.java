package com.vinith.mockito.Mockitodemo.Business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findGreatestFromAllData_BasicScenario() {
		
		DataServiceStub1 dataServiceStub1 = new DataServiceStub1();
		
		SomeBusinessImpl someBusinessimpl=new SomeBusinessImpl(dataServiceStub1);
		int result=someBusinessimpl.findGreatestFromAllData();
		assertEquals(25,result);
		
	}
	
	@Test
	void findGreatestFromAllData_OneValue() {
		
		DataServiceStub2 dataServiceStub2 = new DataServiceStub2();
		
		SomeBusinessImpl someBusinessimpl=new SomeBusinessImpl(dataServiceStub2);
		int result=someBusinessimpl.findGreatestFromAllData();
		assertEquals(35,result);
		
	}
	

}
class DataServiceStub1 implements DataService
{

	@Override
	public int[] retrieveAllData() {
		return new int[] {25,10,23};
	}
	
}
class DataServiceStub2 implements DataService
{

	@Override
	public int[] retrieveAllData() {
		return new int[] {35};
	}
	
}