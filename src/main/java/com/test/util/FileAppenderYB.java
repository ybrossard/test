package com.test.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileAppenderYB {

	private static final String FILE_DIR = "C:/temp/OutputFile.txt";
	private static final DateTimeFormatter LOGS_DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

	public FileAppenderYB() {
	}

	public static void write(String message) {
		try {
			Path path = Paths.get(FILE_DIR);
			OpenOption openOption = path.toFile().exists() ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
			try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, openOption)) {
				bufferedWriter.write(LocalDateTime.now().format(LOGS_DATE_FORMAT) + " => " + message);
				bufferedWriter.write("\n");
			}
		} catch (IOException caught) {
			caught.printStackTrace();
		}
	}
}
