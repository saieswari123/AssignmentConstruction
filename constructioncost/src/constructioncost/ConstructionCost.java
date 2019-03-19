package constructioncost;
/**
 * 
 * @author saieswari
 *
 */
public class ConstructionCost {
	double area;
	String materialstd;
	boolean isAutomated;
	double cost = 0;
	/**
	 * 
	 * @param materialstd
	 * @param area
	 * @param isAutomated
	 */
	public ConstructionCost(String materialstd,int area,boolean isAutomated){
		this.materialstd = materialstd;
		this.area = area;
		this.isAutomated = isAutomated;
	}
	/**
	 * 
	 * @return double constructionCost
	 */
	public double constructionCost(){
		if(materialstd == "std")
			cost = 1200;
		if(materialstd == "abovestd")
			cost = 1500;
		if(materialstd == "highstd")
			cost = 1800;
		if(materialstd == "highstd" && isAutomated == true)
			cost = 2500;
		return area*cost;
	}
	}
