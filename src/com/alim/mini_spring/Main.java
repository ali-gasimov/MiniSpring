package com.alim.mini_spring;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Class<?> clazz = UserRepository.class;
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.println(classLoader);
		System.out.println("Class obtained");
		
		boolean isComponent = clazz.isAnnotationPresent(Component.class);
		
		System.out.println(isComponent);
		
		ComponentScanner scanner = new ComponentScanner();

		scanner.scan();
		
		
		if(isComponent) {
			BeanContainer container = new BeanContainer();
			
			Object object = clazz.getDeclaredConstructor().newInstance();
			container.addBean(clazz, object);
			Object objectFromContainer = container.getBean(clazz);
			System.out.println(object==objectFromContainer);
		}
		else {
			System.out.println("Obyekt yaradilmadi...");
		}
		
    }
}
