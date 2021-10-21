package dad.login.ver;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
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
		
		
		GridPane formPane = new GridPane();
		formPane.setPadding(new Insets(5));
		formPane.setHgap(5);
		formPane.setVgap(5);
		formPane.addRow(0, new Label("Usuario:"), userText);
		formPane.addRow(1, new Label("Contraseña:"), psswdText);
		formPane.addRow(2);
		formPane.add(useLdapCheck, 1, 2);
		
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints()};
		formPane.getColumnConstraints().setAll(cols);
		
		RowConstraints[] rows = { new RowConstraints(), new RowConstraints(), new RowConstraints()};
		formPane.getRowConstraints().setAll(rows);
		
		//RESTRICCIONES PANEL GRID GENERAL
		cols[0].setHgrow(Priority.NEVER);
		cols[1].setHgrow(Priority.ALWAYS);
		
		HBox h3 = new HBox(5, accederButton,cancelarButton);
		h3.setSpacing(5);
		h3.setFillHeight(false);
		h3.setAlignment(Pos.CENTER);
		
		
		setSpacing(5);//espacio entre elementos dentro del VBox
		setFillWidth(false);//Para que no ocupen todo el ancho
		setAlignment(Pos.CENTER);//para ponerlo en el centro
		
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
	
	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
}
