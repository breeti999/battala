package polymorphism;

public class Constructoroverloading {
	double weidth,height,depth;
	Constructoroverloading()
	{
		weidth=height=depth=0;  //1 method
	}
	Constructoroverloading(double w,double h,double d){  //2 method
		weidth=w;
		height=h;
		depth=d;
	}
	Constructoroverloading(double length) //3 method
	{
		weidth=height=depth=length;
	}
	double volume() {
		return(weidth*height*depth);
	}

}
