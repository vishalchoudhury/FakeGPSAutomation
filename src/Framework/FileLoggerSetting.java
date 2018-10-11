package Framework;

import java.io.File;
import java.io.PrintWriter;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class FileLoggerSetting {
	
	public static Logger fileLoggerSetting(Logger OutLogger) {
		FileAppender fileAppender = new FileAppender();
		PrintWriter writer = null;
		File file = new File("test-output\\logfile.txt");
		try {
				writer = new PrintWriter(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		writer.print("");
		writer.close();
		fileAppender.setFile(file.toString());
		fileAppender.setLayout(new SimpleLayout());
		OutLogger.addAppender(fileAppender);
		fileAppender.activateOptions();
		return OutLogger;
	}

}
