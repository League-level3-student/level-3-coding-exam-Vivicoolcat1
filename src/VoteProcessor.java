import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		int votesForPope=0;
		int votesForEdward=0;
		for (int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("edward snowden")) {
				votesForEdward ++;
			}
			else {
				votesForPope ++;
			}}
			if(votesForPope> votesForEdward) {
				return "pope francis";
			}
			else if (votesForEdward>votesForPope) {
				return "edward snowden";
			}
			else {
				return "TIE";
			}
		
		
	}

}
