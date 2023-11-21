package com.vinith.mockito.Mockitodemo.Business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl someBusinessimpl;

	@Test
	void findGreatestFromAllData_BasicScenario() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,13,12});
		assertEquals(25,someBusinessimpl.findGreatestFromAllData());
		
	}
	@Test
	void findGreatestFromAllData_OneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		assertEquals(35,someBusinessimpl.findGreatestFromAllData());
		
	}
	
	@Test
	void findGreatestFromAllData_EmptyArray() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,someBusinessimpl.findGreatestFromAllData());
		
	}
	
	
	

}
