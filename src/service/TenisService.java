package service;

import java.util.List;
import model.Tenis;

public class TenisService {

    public static List<Tenis> buscarPorTamanho(Tenis tenisInformado, List<Tenis> tenises){
        return tenises.stream()
            .filter(tenis -> tenis.tamanho.equals(tenisInformado.tamanho))
            .toList();
    }

    public static List<Tenis> buscarPorModelo(Tenis tenisInformado, List<Tenis> tenises){
        return tenises.stream()
            .filter(tenis -> tenis.modelo.equals(tenisInformado.modelo))
            .toList();
    }

    public Tenis buscarTenisEspecifico(Tenis tenisInformado, List<Tenis> tenises){
        return tenises.stream()
            .filter(tenis -> comparaTenis(tenis, tenisInformado))
            .findFirst().orElse(null);
    }
    

    private boolean comparaTenis(Tenis t1, Tenis t2){
        return t1.modelo.equals(t2.modelo) &&
        t1.tamanho.equals(t2.tamanho) &&
        t1.marca.equals(t2.marca);
    }
}
