//representacion de la libreria
public class HexColor
{
    private final int colorCode;
    /*
     * Constructor, recibe el color en formato
     * hexadecimal
     */
    public HexColor(int colorCode)
    {
        this.colorCode=colorCode;
    }
    //retorna el color
    public int getColorCode()
    {
        return colorCode;
    }
}