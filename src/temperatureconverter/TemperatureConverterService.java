
package temperatureconverter;

import java.text.DecimalFormat;
/**
 * 
 * @author Dan
 */
public class TemperatureConverterService {
    
    public String getCelciusFromFahrenheit(String fahrenheit) throws NumberFormatException{
        double f = Double.valueOf(fahrenheit);
        double c = (f - 32) * 5/9;
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(c);
    } 
    
    public String getFahrenheitFromCelcius (String fahrenheit) throws NumberFormatException {
        double f = Double.valueOf(fahrenheit);
        double temp = (f * 1.8) + 32;
        DecimalFormat df= new DecimalFormat("#0.00");
        return df.format(temp);
    }
}
