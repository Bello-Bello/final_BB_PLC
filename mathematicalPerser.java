
public static char getOperator() throws ParseError {
    TextIO.skipBlanks();
    char op = TextIO.peek(); 

    if ( op == '+' || op == '-' || op == '*' || op == '/' ) {
        TextIO.getAnyChar();  // read the operator, to remove it from the input
        return op;
    }
    else if (op == '\n'){
        throw new ParseError("Missing operator at end of line.");
    }else{
        throw new ParseError("Missing operator.  Found \"" + op + "\" instead of +, -, *, or /.")
    } 
}