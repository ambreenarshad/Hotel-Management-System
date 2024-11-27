module sdaproj1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	opens businessLogic to javafx.base, javafx.fxml;
	opens domain to javafx.base;
	}
