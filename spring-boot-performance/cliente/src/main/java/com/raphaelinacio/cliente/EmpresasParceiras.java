package com.raphaelinacio.cliente;

import java.util.ArrayList;
import java.util.List;

public class EmpresasParceiras {

    public EmpresasParceiras() {
        this.empresasParceiras = new ArrayList<>();
    }

    public List<ParceiroDomain> getEmpresasParceiras() {
        return empresasParceiras;
    }

    private List<ParceiroDomain> empresasParceiras;
}
