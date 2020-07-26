class Interest
{ 
	private int pr,t;
	private double r;
	public void setPrinciple(int pr )
	{      
		this.pr=pr ; 
	} 

	public void setRate(double r) 
	{      
		this.r=r;
	}  

	public void setTime(int t) 
	{     
		this.t=t;
	} 

	public int getPrinciple() 
	{
		return this.pr;   
	}

	public double getRate()  
	{
		return this.r;
	}

	public int getTime() 
	{
		return this.t;
	}

	public double simpleIntrest()
	{
        	return ((this.pr)*(this.r)*(this.t))/100;
	}

	public double compoundInterest()
	{
       		return this.pr*(Math.pow((1+this.r),this.t)-1);   
	}
}
