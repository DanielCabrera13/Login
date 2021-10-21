package dad.login.ver;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty clave = new SimpleStringProperty();
	private BooleanProperty useLdap = new SimpleBooleanProperty();

	public StringProperty usuarioProperty() {
		return this.usuario;
	}

	public String getUsuario() {
		return this.usuarioProperty().get();
	}

	public void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}

	public StringProperty claveProperty() {
		return this.clave;
	}

	public String getClave() {
		return this.claveProperty().get();
	}

	public void setClave(final String clave) {
		this.claveProperty().set(clave);
	}

	public final BooleanProperty useLdapProperty() {
		return this.useLdap;
	}

	public final boolean isUseLdap() {
		return this.useLdapProperty().get();
	}

	public final void setUseLdap(final boolean useLdap) {
		this.useLdapProperty().set(useLdap);
	}

}
