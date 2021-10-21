package dad.login.ver;

import dad.login.App;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
	
	private LoginView view = new LoginView();
	private LoginModel model = new LoginModel();
	
	public LoginController() {
	
		view.getuserText().textProperty().bindBidirectional(model.usuarioProperty());
		view.getpsswdText().textProperty().bindBidirectional(model.claveProperty());
		
		view.getAccederButton().setOnAction(e -> onAccederAction(e));
		view.getCancelarButton().setOnAction(e -> onCancelarAction(e));
		
	}
	
	public LoginView getView() {
		return view;
	}
	
	public LoginModel getModel() {
		return model;
	}
	
	private void onAccederAction(ActionEvent e) {

		AuthService ldap = model.isUseLdap() ? new LdapAuthService() : new FileAuthService();
		
		try {
			if(ldap.login(model.getUsuario(),model.getClave())){
				Alert alertSuccesLogin = new Alert(AlertType.INFORMATION);
				alertSuccesLogin.setTitle("LOGIN");
				alertSuccesLogin.setHeaderText("Acceso permitido");
				alertSuccesLogin.setContentText("Las credenciales de acceso son válidas.");
			}
			else {
				Alert alertLoginFail = new Alert(AlertType.ERROR);
				alertLoginFail.setTitle("LOGIN");
				alertLoginFail.setHeaderText("Acceso denegado");
				alertLoginFail.setContentText("El usuario y/o la contraseña no son válidos.");
				alertLoginFail.showAndWait();
			}
			
		} catch (Exception e1) {
			Alert alertError = new Alert(AlertType.ERROR);
			alertError.setTitle("LOGIN");
			alertError.setHeaderText("ERROR");
			alertError.setContentText("Se ha producido un error de conexión.");
			alertError.showAndWait();
		}	
		}
	
	
	private void onCancelarAction(ActionEvent e) {
		
	}

}
