package org.symare.colourprinter.services.impl;

import org.symare.colourprinter.services.BluePrinter;
import org.symare.colourprinter.services.ColourPrinter;
import org.symare.colourprinter.services.GreenPrinter;
import org.symare.colourprinter.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join("-", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
