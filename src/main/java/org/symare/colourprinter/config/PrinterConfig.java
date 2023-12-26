package org.symare.colourprinter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.symare.colourprinter.services.BluePrinter;
import org.symare.colourprinter.services.ColourPrinter;
import org.symare.colourprinter.services.GreenPrinter;
import org.symare.colourprinter.services.RedPrinter;
import org.symare.colourprinter.services.impl.ColourPrinterImpl;
import org.symare.colourprinter.services.impl.EnglishRedPrinter;
import org.symare.colourprinter.services.impl.SpanishBluePrinter;
import org.symare.colourprinter.services.impl.SpanishGreenPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
