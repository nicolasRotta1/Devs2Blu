package ListaExercicios.Cao_Dono.Controller;

import ListaExercicios.Cao_Dono.Models.Cachorro;

public class CachorroController {
    public void Latir(Cachorro cachorro){
        System.out.println(cachorro.getNome()+" fez AuAu");
    }
}
