package oopWithNLayeredApp.core.logging;

import java.lang.System.Logger;
import java.util.ResourceBundle;

public class FileLogger implements Logger{
	
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoggable(Level level) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String format, Object... params) {
		// TODO Auto-generated method stub
		
	}
	

}
