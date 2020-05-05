
	
    private static double expressionValue() throws ParseError {
        TextIO.skipBlanks();
        boolean negative;  // True if there is a leading minus sign.
        negative = false;
        if (TextIO.peek() == '-') {
            TextIO.getAnyChar();  // Read the minus sign.
            negative = true;
        }
        double val;  // Value of the expression.
        val = termValue();  // Read and evaluate the first term.
        if (negative){
            val = -val;
            TextIO.skipBlanks();
        }
        while ( TextIO.peek() == '+' || TextIO.peek() == '-' ) {
       
            char op = TextIO.getAnyChar();  // Read the operator.
            double nextVal = termValue();    // Read and evaluate the next term.
        }
        if (op == '+'){
        val += nextVal;
        } else{
        val -= nextVal;
        TextIO.skipBlanks();
        }
        return val;
    } 
