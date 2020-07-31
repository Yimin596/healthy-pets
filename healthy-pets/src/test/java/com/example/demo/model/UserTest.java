package com.example.demo.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class UserTest {

	@Test
	public void testConstructorOne() {
		User a = new User("haha", "ha", "ha", "aaa");
		assertEquals("haha", a.getFirstName());
		assertEquals("ha", a.getLastName());
		assertEquals("ha", a.getEmail());
		assertEquals("aaa", a.getPassword());
	}
	@Test
	public void testConstructorTwo() {
		Collection<Role> roles = new ArrayList<>();
		User a = new User("haha", "ha", "ha", "aaa", roles);
		assertEquals(roles, a.getRoles());
	}
	@Test
	public void testSetId() {
		User b = new User();
		b.setId((long)12345);
		int a = b.getId().intValue();
		assertEquals(a, 12345);
	}
	@Test
	public void testSetName() {
		User b = new User();
		b.setFirstName("diu");
		assertEquals(b.getFirstName(), "diu");
		b.setLastName("ni");
		assertEquals(b.getLastName(), "ni");
	}
	@Test
	public void testSetPassword() {
		User b = new User();
		b.setPassword("eee");
		assertEquals(b.getPassword(), "eee");
	}
	@Test
	public void testSetRoles() {
		Collection<Role> roles = new ArrayList<>();
		User b = new User();
		b.setRoles(roles);
		assertEquals(roles, b.getRoles());
	}
	@Test
	public void testSetEmail() {
		User b = new User();
		b.setEmail("diu");
		assertEquals(b.getEmail(), "diu");
	}
	@Test
	public void testToString() {
		Collection<Role> roles = new ArrayList<>();
		User a = new User("haha", "ha", "ha", "aaa", roles);
		assertEquals(a.toString(), "User{" +
                "id=" + a.getId() +
                ", firstName='" + a.getFirstName() + '\'' +
                ", lastName='" + a.getLastName() + '\'' +
                ", email='" + a.getEmail() + '\'' +
                ", password='" + "*********" + '\'' +
                ", roles=" + roles +
                '}');
	}
}
