package EjerciciosTA30.JUnit_Geometria;

public class Geometria {
	
	//Atributos de clase
	private int id;
	private String nom;
	
	//Constructores
	public Geometria(int id, String nom) {
		this.id = id;
		this.nom  = nom;
	}
	
	public Geometria() {
		this.id = 9;
		this.nom  = "Default";
	}
	
	//Métodos propios de calse Geometria
	//metodo area del cuadrado
	public int areaCuadrado(int n1) {
		return n1 * n1;
	}
	
	//metodo area del circulo
	public double areaCirculo(int r) {
		double PI = 3.1416;
		return PI * Math.pow(r, 2);
	}
	
	//metodo area del triangulo
	public int areaTriangulo(int a, int b) {
		return (a*b)/2;
	}
	
	//metodo area del rectangulo
	public int areaRectangulo(int b, int h) {
		return b * h;
	}
	
	//metodo area del pentagono
	public int areaPentagono(int p, int a) {
		return (p*a) / 2;
	}
	
	//metodo area del rombo
	public int areaRombo(int D, int d) {
		return (D*d) / 2;
	}	
	
	//metodo area del romboide
	public int areaRomboide(int b, int h) {
		return b * h;
	}
	
	//metodo area del trapecio
	public int areaTrapecio(int B, int b, int h) {
		return ((B+b) / 2) * h;
	}
	
	//Selector figuras
	public void figura(int fiCode) {
		
		String figura = "";
		double areaFig = 0.0;
		
		switch(fiCode) {
		case 1: figura = "Cuadrado";
				areaFig = areaCuadrado(4);
				break;
		case 2: figura = "Circulo";
				areaFig = areaCirculo(2);
				break;
		case 3: figura = "Triangulo";
				areaFig = areaTriangulo(2,5);
				break;
		case 4: figura = "Rectangulo";
				areaFig = areaRectangulo(2,5);
				break;
		case 5: figura = "Pentagono";
				areaFig = areaPentagono(2,5);
				break;
		case 6: figura = "Rombo";
				areaFig = areaRombo(2,5);
				break;
		case 7: figura = "Romboide";
				areaFig = areaRomboide(2,3);
				break;
		case 8: figura = "Trapecio";
				areaFig = areaTrapecio(2,2,3);
				break;
		default: figura = "Default";
				 areaFig = 10.00;
				 break;
				
		}
		
		System.out.println("La figura seleccionada es: " + figura);
		System.out.println("Su area es: " + areaFig);

	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Geometria [id=" + id + ", nom=" + nom + "]";
	}	
	
}
