package epam_project_4.Session_4;
public class S_C_Interest {
	public double s_interest(double p,double t,double r)
	{
		double si;
		si=(p*t*r)/100.0;
		return si;
	}
	public double c_interest(double p,double t,double r)
	{
		double ci;
		ci=p*Math.pow(1.0+r/100.0,t)-p;
		return ci;
	}
}
