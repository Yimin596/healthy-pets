package com.example.demo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoleTest {

	@Test
	public void testSetData() {
		Role r = new Role();
		r.setId((long)12345);
		int i = r.getId().intValue();
		assertEquals(i, 12345);
		r.setName("Hello");
		assertEquals("Hello", r.getName());
	}
	
	@Test
	public void testToString() {
		Role r = new Role("well");
		assertEquals(r.toString(), "Role{" +
                "id=" + r.getId() +
                ", name='" + r.getName() + '\'' +
                '}');
	}

}
