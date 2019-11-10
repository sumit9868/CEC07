public class player {
	private int score;

	private String name;

	public String getName() {
		return name;
	}

	public player(String name) {
		this.name = name;
		this.score=0; 
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		System.out.println(name+", your score is");
		this.score = score;
	}

}
