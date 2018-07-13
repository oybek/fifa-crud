
package boo.fifa.entities;

@Entity
public class Group {

	@Id
	private char ch;

	public Group() {
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}
}

