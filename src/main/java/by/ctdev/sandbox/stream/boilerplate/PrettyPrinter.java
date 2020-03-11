package by.ctdev.sandbox.stream.boilerplate;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;

public class PrettyPrinter {
    private final PrintStream out;

    public PrettyPrinter() {
        this(System.out);
    }

    public PrettyPrinter(PrintStream out) {
        this.out = out;
    }

    public PrettyPrinter prettyPrint(Object data) {
        printWithPrefix(data, "");
        return this;
    }

    private void printWithPrefix(Object data, String prefix) {
        final String indent = prefix + "  ";
        if (data instanceof Collection) {
            Collection<?> collection = (Collection<?>) data;
            out.println("[");
            collection.forEach(item -> {
                out.print(indent);
                printWithPrefix(item, indent);
            });
            out.print(prefix);
            out.println("]");
        } else if (data instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) data;
            out.println("{");
            map.forEach((key, value) -> {
                out.print(indent);
                out.print(key.toString());
                out.print(" -> ");
                printWithPrefix(value, indent);
            });
            out.print(prefix);
            out.println("}");
        } else {
            out.println(data);
        }
    }

}
