package hello;

public class Operation {
    
    private final long result;
    
    public long getResult() {
        return result;
    }
    
    public Operation(long first, long second, String operator) {
        switch(operator) {
            case "+": result = first + second;
                break;
            case "-": result = first - second;
                break;
            case "*": result = first * second;
                break;
                
            case "/": result = first / second;
                break;
                
            default: result = 0;
        }
    }
}
