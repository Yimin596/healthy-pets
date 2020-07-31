package com.example.demo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecordTest {

	@Test
	public void setId() {
		Record r = new Record();
		r.setId(12345);
		assertEquals(12345, r.getId());
	}
	@Test
	public void setName() {
		Record r = new Record("a", "b", "c");
		r.setName("ddd");
		assertEquals("ddd", r.getName());
	}
	
	@Test
	public void setDate() {
		Record r = new Record();
		r.setDate("111");
		assertEquals("111", r.getDate());
	}
	@Test
	public void setEvent() {
		Record r = new Record();
		r.setEvent("h");
		assertEquals("h", r.getEvent());
	}
	
	
}
