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

	////////////////////////////////////////
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isClubSocial() {
		return clubSocial;
	}

	public void setClubSocial(boolean clubSocial) {
		this.clubSocial = clubSocial;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
}