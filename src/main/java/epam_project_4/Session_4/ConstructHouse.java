package epam_project_4.Session_4;

public class ConstructHouse 
{
		public double Housecost(double st,double aar)
		{
			double n=aar;
			if(st==3)
				n=aar*1200;
			else if(st==5)
				n=aar*1500;
			else if(st==7)
				n=aar*1800;
			else if(st==9)
				n=aar*2500;
			return n;
		}

}
