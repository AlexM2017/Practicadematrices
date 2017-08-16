import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplodematrices {

	public static void main(String[] args) {
		
		Ejemplodematrices obj = new Ejemplodematrices();

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Por Favor Ingrese Un Valor: ");
			numeros[i]=obj.leevalorentero();

			

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i]);

		}
	}

	public int leevalorentero() {

		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader leer = new BufferedReader(io);

		String valor = "";
		
		int entero=0;
				
		try {
			
			entero = Integer.parseInt(valor);
			valor = leer.readLine();
						
		} catch (NumberFormatException nf) {
			// TODO Auto-generated catch block
			System.out.println("Usted es estupido ");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("La Nada ");
		}

		return entero;

	}
}
