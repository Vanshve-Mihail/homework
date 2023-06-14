class Calculator {
    public double calculate(String equation) throws Exception {
        equation = equation.replaceAll("\\s+", "");
        if (equation.isEmpty()) {
            throw new Exception("Пустое уравнение.");
        }
        return evaluateExpression(equation);
    }
    private double evaluateExpression(String expression) throws Exception {
        if (expression.contains("|")) {
            int start = expression.indexOf("|") + 1;
            int end = expression.indexOf("|", start);
            double number = evaluateExpression(expression.substring(start, end));
            return Math.abs(number);
        } else if (expression.contains("^")) {
            int index = expression.indexOf("^");
            double base = evaluateExpression(expression.substring(0, index));
            double exponent = evaluateExpression(expression.substring(index + 1));
            return Math.pow(base, exponent);
        } else if (expression.contains("*")) {
            int index = expression.indexOf("*");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left * right;
        } else if (expression.contains("/")) {
            int index = expression.indexOf("/");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left / right;
        } else if (expression.contains("//")) {
            int index = expression.indexOf("//");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 2));
            return (int) (left / right);
        } else if (expression.contains("%")) {
            int index = expression.indexOf("%");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left % right;
        } else if (expression.contains("+")) {
            int index = expression.indexOf("+");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left + right;
        } else if (expression.contains("-")) {
            int index = expression.indexOf("-");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left - right;
        } else {
            return Double.parseDouble(expression);
        }
    }
}
