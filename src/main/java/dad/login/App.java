package dad.login;

import dad.login.ver.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private LoginController controladorLogin;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controladorLogin = new LoginController();
		
		Scene loginScene = new Scene(controladorLogin.getView(), 320, 200);
		
		Stage loginStage = new Stage();
		loginStage.setTitle("LOGIN");
		loginStage.setScene(loginScene);
		loginStage.show();

	}
	
	public void init() throws Exception{
		System.out.println("Iniciando mi aplicación.");
		}
	
	public void stop() throws Exception{
		System.out.println("Cerrando mi aplicación.");
		
	}

	public static void main(String[] args) {
		

	}

}
