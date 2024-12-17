package clasesDatos;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categoria;
	private int edad;
	private boolean clubSocial; //indica si el empleado está en el club social de la empresa
	private float sueldo;
	
	/////////////////// CONSTRUCTORES ////////////////////
	/**
	 * Constructor completo
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param categoria
	 * @param edad
	 * @param clubSocial
	 * @param sueldo
	 */
	public Empleado(String dni, String nombre, String apellidos, String categoria, int edad, boolean clubSocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.edad = edad;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}
	
	//Constructor vacío
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "**********";
		this.apellidos = "**********";
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;
	}
	
	//Constructor parcial
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 */
	public Empleado(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;		
	}
	
	
}