package ListaExercicios.Cao_Dono.Controller;

import ListaExercicios.Cao_Dono.Models.Cachorro;
import ListaExercicios.Cao_Dono.Models.Dono;

public class DonoController {
    public void Passear(Dono dono, Cachorro cachorro){
        System.out.println(dono.getNome()+ "esta passeando com "+cachorro.getNome());
    }
}
