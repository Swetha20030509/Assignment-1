package Assignment7;
import java.util.*;
class Person
{
	String name;
	float weight;
	float height;
	float bmi;
	Person(String name,float weight,float height,float bmi)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.bmi=bmi;
	}
	public void displayDetail()
	{
 
		String bmiStatus="";
		if(bmi<18.5)
			bmiStatus="underweight";
		else if(bmi >= 18.5 && bmi < 25)
			bmiStatus="normal";
		else if(bmi >= 25 && bmi < 30)
			bmiStatus="overweight";
		else
			bmiStatus="obesity";
		String bmiValue = String.format("%.1f", bmi);
		System.out.println(name+"   "+bmiValue+"   "+bmiStatus);
	}
}
public class BmiCalculate {

	public float calculateBmi(float weight,float height)
	{
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BmiCalculate bmiCalculate=new BmiCalculate();
		System.out.println("Enter the number of person compare");
		int numberOfPerson=sc.nextInt();
		Person[] persondetail=new Person[numberOfPerson];
		for(int i=1;i<=numberOfPerson;i++)
		{
			System.out.println("Enter the "+i+" person name");
			String name=sc.next();
			System.out.println("Enter the weight");
			float weight=sc.nextFloat();
			System.out.println("Enter the height");
			float height=sc.nextShort();
			height=height/100;
			float bmi=bmiCalculate.calculateBmi(weight, height);
			Person newPerson=new Person(name,weight,height,bmi);
			persondetail[i-1]=newPerson;
		}
		for(int i=0;i<persondetail.length;i++)
		{
			for(int j=i+1;j<persondetail.length;j++)
			{
				if(persondetail[i].bmi<persondetail[j].bmi)
				{
					Person temp=persondetail[j];
					persondetail[j]=persondetail[i];
					persondetail[i]=temp;
				}
			}
		}
		System.out.println("Name    |"+"bmi    |"+"Status");
		for(int j=0;j<persondetail.length;j++)
		{
			persondetail[j].displayDetail();
		}
	}

}
