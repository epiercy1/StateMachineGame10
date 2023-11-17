
public class TrueEnding1 {
private Model model;
	
	public TrueEnding1(Model model) {
		this.model = model;
	}

	public String description() {
		String description = "You confess your love to your friend. She pulls you in for a kiss. Congraduations, you won the game! Ending 4 of 9.";
		return description;
	}
		
	public void EndGame() {
		model.setCurrentState(StateType.EndOfGame);
	}
	
}

