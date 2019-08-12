/**  
 *
 * @Title: User.java
 * @Description: TODO
 * @author: wangxiechen
 * @date: 2019年8月12日 上午8:45:01
 * @version: V1.0  
 */
package com.wangxiechen.redis.domain;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: wangxiechen 
 * @date: 2019年8月12日 上午8:45:01
 */
public class User implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: TODO
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String name;
	/**
	 * @fieldName: sex
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String sex;
	/**
	 * @fieldName: tel
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String tel;
	/**
	 * @fieldName: box
	 * @fieldType: String
	 * @Description: TODO
	 */
	private String box;
	/**
	 * @fieldName: birthday
	 * @fieldType: Integer
	 * @Description: TODO
	 */
	private Integer birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBox() {
		return box;
	}
	public void setBox(String box) {
		this.box = box;
	}
	public Integer getBirthday() {
		return birthday;
	}
	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User(Integer id, String name, String sex, String tel, String box, Integer birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.box = box;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", tel=" + tel + ", box=" + box + ", birthday="
				+ birthday + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((box == null) ? 0 : box.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (box == null) {
			if (other.box != null)
				return false;
		} else if (!box.equals(other.box))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	
	
	
}
