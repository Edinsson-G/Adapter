public class ColoreadorFondosTest
{
    public static void main(String[] args) {
        ColoreadorFondos coloreadorFondos = new ColoreadorFondos();
        HexColor colorNegro = new HexColor(0x000000);
        HexColorAdapter hexColorAdapter=new HexColorAdapter(colorNegro);
        String colorFondo = coloreadorFondos.colorea(hexColorAdapter);
        System.out.println("Color RGB: "+colorFondo);
    }
}