package stru.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {

	private String stateName;
	private List<Profitable> cities;
	
	public State(String stateName) {

		super();
		this.setStateName(stateName);
		cities = new ArrayList<Profitable>();
	}
	@Override
	public double getProfit() {

		double profit = 0;
		for(Profitable obj : cities) 
			profit = profit + obj.getProfit();
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		
		if(child instanceof City)
			cities.add(child);
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
