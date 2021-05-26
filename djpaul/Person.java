/**
 * 
 */
/**
 * @author Sachin Paul
 *
 */
package model;

import javax.persistence.*;


@Entity
public class Person
{

		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int Id;
		@Column
		private String fname;
		@Column
		private String lname;
		@Column
		private int age;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}
