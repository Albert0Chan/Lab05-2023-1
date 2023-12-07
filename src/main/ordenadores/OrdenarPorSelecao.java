package ordenadores;

import java.util.Arrays;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] arr) {
        Arrays.sort(arr);
            return arr;
    }
    
}
