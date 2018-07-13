
package boo.fifa.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

@Entity
public class Group {

	@Id
	private char ch;

	public Group() {
	}

	public Group(char ch) {
		this.ch = ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}
}

