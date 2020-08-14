package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is the entity class to set a role entity table.
 * @author Zijun Mei, Yimin Li
 *
 */
@Entity
public class Role {

	/**
	 * the id attribute of the table entity.
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
	 * the name attribute of the table entity.
	 */
    private String name;

    /**
     * the construction method.
     */
    public Role() {
    }

    /**
     * the construction method with name parameter.
     * @param name
     */
    public Role(String name) {
        this.name = name;
    }

    /**
     * the method for get id attribute.
     * @return the value of id.
     */
    public Long getId() {
        return id;
    }
    /**
     *  the method to set up the id value.
     * @param id the attribute of id in the table.
     */

    public void setId(Long id) {
        this.id = id;
    }
    /**
     * the method for get name attribute.
     * @return the value of name.
     */
    public String getName() {
        return name;
    }
    /**
     *  the method to set up the name value.
     * @param name the attribute of name in the table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * return the certain format of a string which include role information.
     */
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
