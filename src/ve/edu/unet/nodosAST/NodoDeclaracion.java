package ve.edu.unet.nodosAST;

public class NodoDeclaracion extends NodoBase {
    private String identificador;
	private tipoVar tipo;
	
	public NodoDeclaracion(String identificador, tipoVar tipo) {
		super();
		this.identificador = identificador;
        this.tipo = tipo;
	}


	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public tipoVar getTipo() {
		return tipo;
	}

	public void setOpDerecho(tipoVar tipo) {
		this.tipo = tipo;
	}	
}
