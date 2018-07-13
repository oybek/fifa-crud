
package boo.fifa.entity;

import javax.persistence.*;

@Entity
@Table(
        name="Match",
		uniqueConstraints=@UniqueConstraint(columnNames={"team1", "team2"})
)
public class Match {

	@ManyToOne
	@JoinColumn(name = "country", nullable = false)
	private Team team1;

	@ManyToOne
	@JoinColumn(name = "country", nullable = false)
	private Team team2;

	private int team1GoalNum;

	private int team2GoalNum;

	public Match() {
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam1() {
		return this.team1;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Team getTeam2() {
		return this.team2;
	}

	public void setTeam1GoalNum(int team1GoalNum) {
		this.team1GoalNum = team1GoalNum;
	}

	public int getTeam1GoalNum() {
		return this.team1GoalNum;
	}

	public void setTeam2GoalNum(int team2GoalNum) {
		this.team2GoalNum = team2GoalNum;
	}

	public int getTeam2GoalNum() {
		return this.team2GoalNum;
	}
}

