public class Calculate {

    double dlugoscLini ( Point pointPoczatek, Point pointKoniec){
        double dlX =   pointKoniec.x - pointPoczatek.x;
        double dlY =   pointKoniec.y - pointPoczatek.y;
        return  Math.sqrt( dlX * dlX + dlY * dlY);
    }
    
}
