package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.length()==0)
        return 0;
    	String[] val = input.split(",");
    	int sum=0;
    	for(String value : val) {
    		sum = sum + Integer.valueOf(value);
    	}
    		return sum;
    }
    
}
