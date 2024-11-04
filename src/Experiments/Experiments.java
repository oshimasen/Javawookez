package Experiments;

//non-static field = instance variable
//static field = class variable
 class Experiments {
	
	public static void main(String[]args) {
		
		Dog myDog = new Dog("irongbuang");
		Dog imongDog = new Dog("buang");
		
		Mom urDog = new Mom();
		Mom urMama = new Mom();
		urDog = urMama;
		
		
//		Dog mydOg;
		
		System.out.println(myDog.dogName);
		System.out.println(imongDog.dogName);
		myDog.makeNoise();
//		System.out.println(Dog.dogName);
	}
	
}

 class Dog{
	 //with static, it will overwrite the values to the latest assignment
	public String dogName;
	public String name;
	public Dog() {
		dogName = "irongyawa";
	}
	public Dog(String iro){
		dogName = iro;
		this.name = iro;
//		dogName = "black";
	}
	public void makeNoise() {
		System.out.println("meow");
	}
	
	  
}
 class Mom{
	 
 }
