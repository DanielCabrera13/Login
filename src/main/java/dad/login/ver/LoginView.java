package dad.login.ver;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
	
	private TextField userText;
	private PasswordField psswdText;
	private CheckBox useLdapCheck;
	private Button accederButton;
	private Button cancelarButton;
	
	public LoginView() {
		super();
		
		userText = new TextField();
		userText.setPrefColumnCount(8);
		userText.setPromptText("Nombre de usuario");
		
		psswdText = new PasswordField();
		psswdText.setPrefColumnCount(8);
		psswdText.setPromptText("Contraseña de usuario");
		
		useLdapCheck = new CheckBox("Usar LDAP");
		
		accederButton = new Button("Acceder");
		
		cancelarButton = new Button("Cancelar");
		
		HBox h1 = new HBox(5, new Label("Usuario: "), userText);
		HBox h2 = new HBox(5, new Label("Contraseña: "), psswdText);
		HBox h3 = new HBox(5, accederButton,cancelarButton);
		
		setSpacing(5);//espacio entre elementos dentro del VBox
		setFillWidth(false);//Para que no ocupen todo el ancho
		setAlignment(Pos.CENTER);//para ponerlo en el centro
		getChildren().addAll(h1, h2, useLdapCheck, h3);
	}
	
	public TextField getuserText() {
		return userText;
	}
	
	public PasswordField getpsswdText() {
		return psswdText;
	}
	
	public CheckBox getuseLdapCheck() {
		return useLdapCheck;
	}
	
	public Button getaccederButton() {
		return accederButton;
	}

	public Button getcancelarButton() {
		return cancelarButton;
	}
}
