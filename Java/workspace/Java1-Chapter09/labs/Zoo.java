package labs;


public class Zoo {
    public static void main(String[] args){
    		
    	Lion a1 = new Lion(); 
		a1.setGender("Male");
		a1.setWeight(400);
		Giraffe a2 = new Giraffe();
		a2.setGender("female");
		a2.setWeight(1000);
		
		a2.EatLeaves();
    	
    	
    	//        Animal a1 = new Animal("giraffe", 480); //name, weight
//        Animal a2 = new Animal("lion", 300, "male"); //name, weight, gender
        
        
        Animal [] arr = {a1,a2};
        soundOff(arr);
        
        
    }
    //Run stick along all animal cages so they make each
    public static void soundOff(Animal [] animals){
    	for (Animal a : animals) {
			a.makeNoise();
		}
    	
    	
    	
    }
}