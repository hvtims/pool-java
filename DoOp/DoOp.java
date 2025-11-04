public class DoOp {
    public static String operate(String[] args) {
        if (args.length < 3) {
            return "it depend on the input.";
        }

        int firstnbr = Integer.parseInt(args[0]);
        String operator = args[1];
        int thrdnbr = Integer.parseInt(args[2]);
        int result;

        switch (operator) {
            case "+":
                result = firstnbr + thrdnbr;
                break;
            case "-":
                result = firstnbr - thrdnbr;
                break;
            case "*":
                result = firstnbr * thrdnbr;
                break;
            case "/":
                if (thrdnbr == 0) return "Error";
                result = firstnbr / thrdnbr;
                break;
            case "%":
                if (thrdnbr == 0) return "Error";
                result = firstnbr % thrdnbr;
                break;
            default:
                return "Error";
        }

        return String.valueOf(result);
    }
}
