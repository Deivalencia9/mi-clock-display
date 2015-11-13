/**Crea un nuevo repositorio en GitHub llamado mi-clock-display.

 *Luego codifica en BlueJ la clase NumberDisplay realizando los commits que creas oportunos. A continuación se indica qué es necesario que, como mínimo, implemente dicha clase:

 *Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
 *Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
 *Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
 *Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
 *Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite (nombre del método: increment)
 *Una vez que hayas comprobado que funciona, sube el repositorio a GitHub e indica la URL del último commit como respuesta de esta actividad.

 /**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limit;
    private int display;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int maximo)
    {
        // initialise instance variables
        limit = maximo;
        display = 0;
    }
    
    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro 
     */
    public void setValue(int value)
    {
        if(value >= 0 && value<= limit){
            display = value;
        }
    }
    
    /**
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres
     */
    public String getDisplayValue()
    {
        String displayValue = display + "";
        if(display<10){
            displayValue = "0"+ display;
        }
        return displayValue;
    }
    
    /**
     * Un método que devuelve el valor actual del display como entero
     */
    public int getValue()
    {
        return display;
    }
}
