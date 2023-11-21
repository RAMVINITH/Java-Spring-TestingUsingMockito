package com.vinith.mockito.Mockitodemo.Business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findGreatestFromAllData()
	{
		
		int greatestValue=Integer.MIN_VALUE;
		int data[]=dataService.retrieveAllData();
		for(int value: data)
		{
			if(value>greatestValue)
				greatestValue=value;
		}
		return greatestValue;
		
	}

}

interface DataService
{
	int[] retrieveAllData();
}
