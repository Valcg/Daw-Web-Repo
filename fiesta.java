package modelo.javabean;

//----------------------------------ATRIBUTOS , ESTRUCTURA-----------------------------
// 

public class Fiesta {
	
	/*---------------------------------------NO FORMAN PARTE DE OBJETOS------------------------------------
	---------------------------------------METODOS DE LA CLASE , "constantes (final)" -----------------
 	con final no los toca nadie no importa que sea public */
	
	
	public static final double PRECIO_BOCATA   ;
	public static final double PRECIO_BEBIDA   ;
	public static final double PRECIO_INVITADO ;
	
	
	// es parecido a un constructor pero no lo es , aqui defines todo lo estatico
	
	static {
		
		PRECIO_BOCATA   = 4;
		PRECIO_BEBIDA   = 2;
		PRECIO_INVITADO = 5;
	}
	
	private String tipo;
	private int invitados;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private String fecha;
	private String hora;
	
	//-------------------------------------MÉTODOS-----------ATRIBUTOS DE OBJETO DE INSTANCIA------------------------------
	
	public Fiesta(String tipo, int invitados, String direccion, int bocadillos, int bebidas, String fecha, String hora) {
		super();
		this.tipo = tipo;
		this.invitados = invitados;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.fecha = fecha;
		this.hora = hora;
	}
   //----------------------------------------------METODO POR DEFECTO-------------------------
	
	public Fiesta() {
		super();
	}

	//------------------------------------------GETTER AND SETTER---------------------------


	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

//---------------------------------------REDEFINIR METODOS DE OBJECT------------------------------------
	@Override
	public String toString() {
		return "fiesta [Tipo=" + tipo + ", invitados=" + invitados + ", direccion=" + direccion + ", bocadillos="
				+ bocadillos + ", bebidas=" + bebidas + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

	/*---------------------------------------METODOS PROPIOS-------------------------------------------*/
	
	
	// IMPLEMENTAR UN METODO ES DARLE INSTRUCCIONES A UN METODO
	
	
	// INVITAR() : VOID -> AÑADE 1
	//INVITAR(INT INVITADOS): VOID
	//CANCELARINIVTACION():VOID
	//CANCELARINIVTACION(INT INVITADOS):VOID
	// PRECIOSFIESTA(): DOUBLE
	// 5$ INVITADOS , 2$ BEBIDAS , 4$ BOCADILLOS
	
	// CONTAR DE 1 EN 1 ++

	public void invitar () {
		
		invitados++;
		
		/* INVITADOS = INVITADOS + 1;
		INVITADOS+=1;*/
		
		
	}
	// ACUMULAR +=
	public void invitar(int invitados) {
		
		// this.invitados = this.invitados + INVITADOS;
		 this.invitados += invitados;
		
	}
	
	public void cancelarInvitacion() {
		
		invitados--;
		
	}
	
	public void cancelarInvitacion(int invitados) {
		
		
		 this.invitados -= invitados;
	}
	
	public double precioFiesta() {
		
		return invitados   * PRECIO_INVITADO + 
			    bebidas    * PRECIO_BEBIDA   + 
			    bocadillos *  PRECIO_BOCATA  ;
	}
	
	
	
	
}

