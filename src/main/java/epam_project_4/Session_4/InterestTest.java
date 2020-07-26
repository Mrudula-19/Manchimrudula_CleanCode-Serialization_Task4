package epam_project_4.Session_4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class InterestTest {
	@Test
	public void test1() {
		S_C_Interest inst = new S_C_Interest();
		double m = inst.s_interest(4000,2,3);
		assertEquals(240.0,m,0.001);
		double m1 = inst.c_interest(4000,2,3);
		assertEquals(243.600000,m1,0.001);
	}
	@Test
	public void test2() {
		S_C_Interest in = new S_C_Interest();
		double n = in.s_interest(3000,3,3);
		assertEquals(270.0,n,0.001);
		double n1 = in.c_interest(3000,3,3);
		assertEquals(278.18100,n1,0.001);
	}
	@Test
	public void test3() {
		S_C_Interest it = new S_C_Interest();
		double p = it.s_interest(7000,5,7);
		assertEquals(2450.0,p,0.001);
		double r = it.c_interest(7000,5,7);
		assertEquals(2817.862115,r,0.001);
	}
}
