
package boo.fifa.entities;

@Entity
public class Team {

	@Id
	private String country;

	@ManyToOne
	@JoinColumn(name = "ch", nullable = false)
	private Group group;

	public Team() {
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Group getGroup() {
		return this.group;
	}
}

