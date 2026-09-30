package com.alim.mini_spring;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComponentScanner {

	public void scan() throws Exception{
		
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource("com/alim/mini_spring");
		Path path = Path.of(resource.toURI());
		Files.list(path).forEach(path2 -> {
			if (path2.getFileName().toString().endsWith(".class")) {
				System.out.println(path2);
			}
		});
		
	}
}
