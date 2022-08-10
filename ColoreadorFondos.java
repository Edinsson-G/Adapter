//clase cliente
public class ColoreadorFondos
{
    public String colorea(RgbColor color)
    {
        return String.format
        (
            "%d,%d,%d",
            color.getRed(),
            color.getGreen(),
            color.getBlue()
        );
        /*
         * regresa una cadena con la información
         * de cada uno de los elementos obtenidos
         * de la instancia RgbColor color
         */
    }
}