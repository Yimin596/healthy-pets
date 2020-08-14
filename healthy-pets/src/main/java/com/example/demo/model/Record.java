package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
/**
 * The class create an entity of table for recording in database.
 * @author Zijun Mei, Yimin Li.
 *
 */
@Entity
@Table(name = "records")
public class Record {
	
	/**
	 * The name of the pets.
	 */
	@NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;
	/**
	 * this is the ID OF the table.
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	/**
	 * This is the date of the records.
	 */
	@NotBlank(message = "Date is mandatory")
	@Column(name = "date")
	private String date;
	/**
	 * This is the event attribute of the table.
	 */
	@NotBlank(message = "Event is mandatory")
	@Column(name = "event")
	private String event;
	/**
	 * this is the status attribute for the pets.
	 */
	@NotBlank(message = "status is mandatory")
	@Column(name = "status")
	private String status;
	/**
	 * this is the species attribute for the pets.
	 */
	@NotBlank(message = "species is mandatory")
	@Column(name = "species")
	private String species;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	

	/**
	 * construction method.
	 */
	public Record() {}
	/**
	 * construction method with series of parameters. for initializing.
	 * @param name the name of pets.
	 * @param date the record in date.
	 * @param event the event user want to record.
	 * @param status the status of the pets
	 * @param species the species of the pets.
	 */
	public Record(String name, String date, String event, String status, String species)
	{
		
		this.name = name;
		this.date = date;
		this.event = event;
		this.status = status;
		this.species = species;
		
	
	}
	/**
	 * construction method with series of parameters. for initializing.
	 * @param name the name of pets.
	 * @param date the record in date.
	 * @param event the event user want to record.
	 * @param status the status of the pets
	 * @param species the species of the pets.
	 * @param user the user of the record.
	 */
	public Record(String name, String date, String event, String status, String species, User user)
	{
		
		this.name = name;
		this.date = date;
		this.event = event;
		this.status = status;
		this.species = species;
		this.user = user;
	
	}
	/**
	 * set The ID of the table.
	 * @param id The ID of the table.
	 */
	public void setId(long id) {
        this.id = id;
    }
/**
	 * get the Id method. 
	 * @return id of the table
	 */
    public long getId() {
        return id;
    }


	
    /**
     * set the name attribute of the table.
     * @param name the name attribute.
     */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * method of get name attribute.
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * set the date attribute of date.
	 * @param date the attribute of date.
	 */
	public void setDate(String date)
	{
		this.date = date;
	}
	/**
	 * the method of get date attribute.
	 * @return date attribute.
	 */
	public String getDate()
	{
		return date;
	}
	/**
	 * the method of set event attribute.
	 * @param event the evnet attribute of table.
	 */
	public void setEvent(String event)
	{
		this.event = event;
	}
	/**
	 * the method of get event attribute.
	 * @return event attribute.
	 */
	public String getEvent()
	{
		return event;
	}
	/**
	 * the method of set species attribute.
	 * @param species the species attribute of table.
	 */
	public void setSpecies(String species)
	{
		this.species = species;
	}
	/**
	 * the method of get species attribute.
	 * @return species attribute.
	 */
	public String getSpecies()
	{
		return species;
	}
	/**
	 * the method of set status attribute.
	 * @param status the status attribute of table.
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	 * the method of get status attribute.
	 * @return status attribute.
	 */
	public String getStatus()
	{
		return status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
