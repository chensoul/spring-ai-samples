package cc.chensoul.ai;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    @McpTool(name = "add", description = "Add two numbers")
    public double add(
            @McpToolParam(description = "First number", required = true) double a,
            @McpToolParam(description = "Second number", required = true) double b) {
        return a + b;
    }

    @McpTool(name = "subtract", description = "Subtract two numbers")
    public double subtract(
            @McpToolParam(description = "Minuend", required = true) double a,
            @McpToolParam(description = "Subtrahend", required = true) double b) {
        return a - b;
    }

    @McpTool(name = "multiply", description = "Multiply two numbers")
    public double multiply(
            @McpToolParam(description = "First number", required = true) double a,
            @McpToolParam(description = "Second number", required = true) double b) {
        return a * b;
    }

    @McpTool(name = "divide", description = "Divide two numbers")
    public double divide(
            @McpToolParam(description = "Dividend", required = true) double dividend,
            @McpToolParam(description = "Divisor", required = true) double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return dividend / divisor;
    }
}
