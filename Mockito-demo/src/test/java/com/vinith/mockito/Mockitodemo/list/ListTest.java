package com.vinith.mockito.Mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

	
	@Test
	void simpleTest()
	{
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3,listMock.size());
	}
	@Test
	void multipleReturns_SpecificType()
	{
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn(1).thenReturn(2).thenReturn(3);
		assertEquals(1,listMock.get(0));
		assertEquals(2,listMock.get(0));
		assertEquals(3,listMock.get(0));
		assertEquals(3,listMock.get(0));
		assertEquals(3,listMock.get(0));
	}
	@Test
	void multipleReturns_GenericType()
	{
		List listMock=mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn(1).thenReturn(2).thenReturn(3);
		assertEquals(1,listMock.get(1));
		assertEquals(2,listMock.get(2));
		assertEquals(3,listMock.get(3));
			
	}
}

