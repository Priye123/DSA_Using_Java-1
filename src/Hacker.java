
class Sayable{  
    public String say(String name) {
    	return "Ram";
    }
    public String say1(String name) {
    	return "Mohan";
    }
}  
  
public class Hacker extends Sayable{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter. 
    	//(argument-list) -> {body} 
//        Sayable s1=(name)->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s1.say(true));  
//          
//        // You can omit function parentheses    
//        Sayable s2= name ->{  
//            return "Hello, "+name;  
//        };  
//        System.out.println(s2.say("Sonoo")); 
        
        Sayable s3=new Hacker(); //Dynamic Polymorphism
        
        String m=s3.say("Monali"); //Function call
        System.out.println(m);
       
        
        Sayable s4=new Hacker();
        System.out.println(s4.say1("Priye"));
        
        
    }

	@Override
	public String say(String name) { //Function 
		//System.out.println("Hello");
		return "Hello, "+name;
	}

	@Override
	public String say1(String name) {
		System.out.println("Hello");
		return name;
	}
}  