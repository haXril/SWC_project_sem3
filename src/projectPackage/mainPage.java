package projectPackage;
public class mainPage {

	public static void main(String[] args) {
	
		WelcomePage welcomePage;
		SignUpPage signUp;
		
	try {
		welcomePage = new WelcomePage();
		signUp = new SignUpPage();
		
		welcomePage.setVisible(true);
		welcomePage.setLocationRelativeTo(null);
		Thread.sleep(700);
		welcomePage.progressBar.setVisible(true);
	
		try {
			for (int i = 0; i <= 100; i += 4) {
		
			Thread.sleep(20);
			welcomePage.progressBar.setValue(i);
			welcomePage.lblNewLabel.setText( i + "%");
			}
			Thread.sleep(1000);
			welcomePage.setVisible(false);
			signUp.setVisible(true);
			signUp.setLocationRelativeTo(null);
		} catch (Exception e) {
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
