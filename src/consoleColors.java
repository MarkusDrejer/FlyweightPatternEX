public class consoleColors {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";


    // the text buffer
    private static StringBuilder txtToPrint;

    public consoleColors() {
        txtToPrint = new StringBuilder();
    }

    public void print(boolean newline) {
        if (newline==true) {
            System.out.println(txtToPrint.toString());
        } else {
            System.out.print(txtToPrint.toString());
        }
    }

    public void clearTxtBuffer() {
        this.txtToPrint.setLength(0);
    }

    public consoleColors printTxtRed(String txt) {
        txtToPrint.append(ANSI_RED + txt + ANSI_RESET);
        return this;
    }

    public consoleColors printTxtGreen(String txt) {
        txtToPrint.append(ANSI_GREEN + txt + ANSI_RESET);
        return this;
    }

}