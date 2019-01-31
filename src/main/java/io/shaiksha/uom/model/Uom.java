package io.shaiksha.uom.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Uom.java
 * @version 1.0
 * @author shaiksha
 * @since 31/01/2019
 *
 */
@Document
public class Uom {
	
	@Id
	private String id;
	private String uomType;
	private String uomModel;
	private String description;
	private Date createdDate;
	private Date lastModifiedDate;
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomModel() {
		return uomModel;
	}
	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Uom [id=" + id + ", uomType=" + uomType + ", uomModel=" + uomModel + ", description=" + description
				+ "]";
	}
	public Uom() {
		super();
	}
	public Uom(String id, String uomType, String uomModel, String description) {
		super();
		this.id = id;
		this.uomType = uomType;
		this.uomModel = uomModel;
		this.description = description;
	}
}
