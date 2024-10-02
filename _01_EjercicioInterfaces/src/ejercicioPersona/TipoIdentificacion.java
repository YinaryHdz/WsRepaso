package ejercicioPersona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TipoIdentificacion {
	private String tipo;
	private String numero;
	
	
	public TipoIdentificacion(String tipo, String numero) {
		super();
		if (esTipoValido(tipo)) {
			this.tipo = tipo;
		}else {
			throw new IllegalArgumentException("Tipo de identificación no válido: " + tipo);
		}
		
		if(validarIdentificacion(tipo, numero)) {
			this.numero = numero;
		}else {
			throw new IllegalArgumentException("Numero no válido: " + numero);
		}
	}

	public boolean esTipoValido(String tipo) {
		if(tipo.equalsIgnoreCase("DNI") || tipo.equalsIgnoreCase("NIE") || tipo.equalsIgnoreCase("PASAPORTE")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validarDNI(String numero) {
		String regex = "\\d{8}[A-HJ-NP-TV-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numero);
		return matcher.matches();
	}
	public boolean validarNIE(String numero) {
		String regex = "[XYZ]\\\\d{7}[A-Za-z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numero);
		return matcher.matches();
	}
	public boolean validarPasaporte(String numero) {
		String regex = "[A-Za-z0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numero);
		return matcher.matches();
	}
	 private boolean validarIdentificacion(String tipo, String numero) {
	        switch (tipo.toUpperCase()) {
	            case "DNI":
	                return validarDNI(numero);
	            case "NIE":
	                return validarNIE(numero);
	            case "PASAPORTE":
	                return validarPasaporte(numero);
	            default:
	                return false;
	        }
	 }

	@Override
	public String toString() {
		return "TipoIdentificacion [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	 
}
