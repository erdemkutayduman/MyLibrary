package intro;

public class Main {

	public static void main(String[] args) {
		
		// camelCase
		// CTRL + Space
		
		String internetSubeButonu = "�nternet �ubesi \n";
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean degisim = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t�!");
		}
		
		
		else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Y�kseldi!");
		}
			
		
		else{
			System.out.println("Dolar E�ittir!");
		}
		
		String[] krediler = 
			{
					"H�zl� Kredi \n",
					"Mutlu Emekli Kredisi \n",
					"Konut Kredisi \n",
					"Msb Kredisi \n",
					"Meb Kredisi \n",
					"K�lt�r Bakanl��� Kredisi \n"
			};
		
		for (String kredi : krediler) 
		{
			System.out.print(kredi);			
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < krediler.length; i++) 
		{			
			System.out.print(krediler[i]);
		}
		
	}

}