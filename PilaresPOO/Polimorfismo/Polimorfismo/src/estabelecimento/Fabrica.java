package estabelecimento;

import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.*;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.*;

/* Papel das interfaces:
 * Atribuir características relacionadas de flexibilidade, responsibilidade ou usuabilidade de uma classe
 * 
 * Quando preciso que uma classe tenha mais de um papel eu preciso implementar interfaces
 */

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Digititalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.Imprimir();
        digitalizadora.Digitalizar();
        copiadora.Copiar();
    }
}
