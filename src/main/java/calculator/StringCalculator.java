package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.length()==0)
        return 0;
    	String delimiter = delimit(input);
    	String values = values(input);
    	delimit(input);
    	return sum(values.split(delimiter));
    	
    }
	private String delimit(String input) {
		String delimiter = ",|\n";
    	if(input.startsWith("//"))
    		delimiter = input.substring(2,3);
		return delimiter;
	}
	private String values(String input) {
		String values = input;
    	if(input.startsWith("//"))
    		values = input.substring(3);
    	return values;
	}
    private int sum(String[] values) {
    	int sum=0;
    	for(String value : values) {
    		sum = sum + Integer.valueOf(value);
    	}
    	return sum;
    }
    
}
