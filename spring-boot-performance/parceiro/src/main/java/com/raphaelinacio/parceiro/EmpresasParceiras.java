package com.raphaelinacio.parceiro;

import java.util.List;

public class EmpresasParceiras {

    public EmpresasParceiras(List<ParceiroDomain> empresasParceiras) {
        this.empresasParceiras = empresasParceiras;
    }

    public List<ParceiroDomain> getEmpresasParceiras() {
        return empresasParceiras;
    }

    private List<ParceiroDomain> empresasParceiras;
}
