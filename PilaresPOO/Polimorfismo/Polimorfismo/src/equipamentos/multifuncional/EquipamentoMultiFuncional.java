package equipamentos.multifuncional;


import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digititalizadora;
import equipamentos.impressora.Impressora;

/* Meu EquipamentoMultiFuncional precisa ter todas as características de copiadora,impressora, digitalizadora */
public class EquipamentoMultiFuncional implements Copiadora, Digititalizadora, Impressora {

    @Override
    public void Copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
    }

    @Override
    public void Digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MUTIFUNCIONAL");
    }

    @Override
    public void Imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MUTIFUNCIONAL");
    }
}
