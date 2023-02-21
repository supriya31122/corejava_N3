package org.tnsif.annotations;


	import java.lang.annotation.Annotation;
	import java.lang.annotation.Repeatable;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.reflect.Method;

	//custom annotation
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(MyRepetatedAnnoDemo.class)
	@interface CustomAnnotation{
		//abstract methods
		String print()default "Welcometo N-03 batch";
		int value()default 0;
			
		
	}

	@Retention(RetentionPolicy.RUNTIME)
	@interface MyRepetatedAnnoDemo{
		CustomAnnotation[]value();
	}
	public class RetentionAnnotationDemo {

		@CustomAnnotation(print="Retention Annotation Test",value=1)
		@CustomAnnotation(print="Testing annotation",value=2)
		
		/*public static void main(String[] args) {
			RetentionAnnotationDemo r=new RetentionAnnotationDemo();*/
		public static void testMethod() {
			
			RetentionAnnotationDemo r=new RetentionAnnotationDemo();
			try {
			
			Class<?>c=r.getClass();
			Method m=c.getMethod("testMethod");
			Annotation a=m.getAnnotation(MyRepetatedAnnoDemo.class);
			System.out.println(a);
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
		public static void main(String[] args) {
			testMethod();
		}
		

	}


