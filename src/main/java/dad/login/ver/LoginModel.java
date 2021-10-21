package dad.login.ver;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	
	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty clave = new SimpleStringProperty();
	private BooleanProperty checked = new SimpleBooleanProperty();
	
	public StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public String getusuario() {
		return this.usuarioProperty().get();
	}
	
	public void setusuario(final String usuario ) {
		this.usuarioProperty().set(usuario);
	}
	
	public StringProperty claveProperty() {
		return this.clave;
	}
	
	public String getclave() {
		return this.claveProperty().get();
	}
	
	public void setclave( final String clave) {
		this.claveProperty().set(clave);
	}

}
