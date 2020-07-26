package epam_project_4.Session_4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class H_ConstructHouse 
{
		@Test
		public void test1() {
			ConstructHouse m = new ConstructHouse();
			double org = m.Housecost(3,3132);
			assertEquals(3758400.0,org,0.001);
		}
		@Test
		public void test2() {
			ConstructHouse m = new ConstructHouse();
			double reg = m.Housecost(5,375);
			assertEquals(562500.0,reg,0.001);
		}
		@Test
		public void test3() {
			ConstructHouse m = new ConstructHouse();
			double original = m.Housecost(7,7531);
			assertEquals(13555800.0,original,0.001);
		}
		@Test
		public void test4() {
			ConstructHouse m = new ConstructHouse();
			double register = m.Housecost(9,73);
			assertEquals(182500.0,register,0.001);
		}
		@Test
		public void test5() {
			ConstructHouse m = new ConstructHouse();
			double act = m.Housecost(7,563);
			assertEquals(1013400.0,act,0.001);
		}
		
	}

