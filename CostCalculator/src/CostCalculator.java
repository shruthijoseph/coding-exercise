
import javax.swing.JOptionPane;
public class CostCalculator{
	public static double calculateCost(double bp,int n,double mm)
	 {
		double finalPrice;
		double newBasePrice;
		newBasePrice=bp+(0.05*bp);	
		finalPrice=(newBasePrice)+((0.012*n*newBasePrice)+(mm*newBasePrice));
		return finalPrice;
		}
	public static void main(String[] args)
	{
		String userStringInput;
		double basePrice;
		int no_of_persons;
		String material;
		double materialMarkup=0;
		double CalculatedCost;
		userStringInput=JOptionPane.showInputDialog("Enter the base price");
				basePrice=Double.parseDouble(userStringInput);
		userStringInput=JOptionPane.showInputDialog("Enter the number of people");
		        no_of_persons=Integer.parseInt(userStringInput);
		userStringInput=JOptionPane.showInputDialog("Enter the material");
		        material=userStringInput;
			if (material.equals("food"))
			materialMarkup=0.13;
		if(material.equals("drugs"))
			materialMarkup=0.075;
		if(material.equals("electronics"))
			materialMarkup=0.02;
		
		CalculatedCost=calculateCost(basePrice,no_of_persons,materialMarkup);
		JOptionPane.showMessageDialog(null,String.format("The calculated Price is"+CalculatedCost));

	}

}
