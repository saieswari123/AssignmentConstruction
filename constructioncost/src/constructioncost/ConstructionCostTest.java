package constructioncost;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {

	@Test
	public void testConstructionCost() {
		ConstructionCost c = new ConstructionCost("highstd",500,true);
		assertEquals(1250000,c.constructionCost(),1250000-c.constructionCost());
		c = new ConstructionCost("std",200,false);
		assertEquals(240000,c.constructionCost(),240000-c.constructionCost());
		c = new ConstructionCost("highstd",300,false);
		assertEquals(540000,c.constructionCost(),540000-c.constructionCost());
		c = new ConstructionCost("abovestd",150,false);
		assertEquals(225000,c.constructionCost(),225000-c.constructionCost());
		c = new ConstructionCost("std",400,false);
		assertEquals(480000,c.constructionCost(),480000-c.constructionCost());
		c = new ConstructionCost("highstd",350,false);
		assertEquals(630000,c.constructionCost(),630000-c.constructionCost());
		c = new ConstructionCost("abovestd",250,false);
		assertEquals(375000,c.constructionCost(),375000-c.constructionCost());
	}

}
