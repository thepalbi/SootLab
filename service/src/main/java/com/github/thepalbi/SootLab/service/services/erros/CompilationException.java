package com.github.thepalbi.SootLab.service.services.erros;

import com.github.thepalbi.SootLab.service.compilation.CompilerDiagnostic;

import java.util.List;

public class CompilationException extends DiagnosticsDrivenException {
    public CompilationException(List<CompilerDiagnostic> diagnostics) {
        super(diagnostics);
    }
}
