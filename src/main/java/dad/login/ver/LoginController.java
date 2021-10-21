package dad.login.ver;

public class LoginController {
	
	private LoginView view = new LoginView();
	private LoginModel model = new LoginModel();
	
	public LoginController() {
	
		view.getuserText().textProperty().bindBidirectional(model.usuarioProperty());
		view.getpsswdText().textProperty().bindBidirectional(model.claveProperty());
		
		view.getaccederButton().setOnAction(e -> onAccederAction(e));
		view.getcancelarButton().setOnAction(e -> onCancelarAction(e));
		
	}
	
	public LoginView getView() {
		return view;
	}
	
	public LoginModel getModel() {
		return model;
	}
	
	private void onAccederAction

}
