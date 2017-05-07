Important Observations:

1. In java loops you cannot pass an integer as a test condition. U gotta exactly put a boolean value in test condition:

	for example:
		
		int x = 1;
		while(x){	//This will throw a compiler error saying incompatible types integer cannot be converted to boolean

		}

		boolean isTrue = true;
		while(isTrue){ //This will Work
		}



