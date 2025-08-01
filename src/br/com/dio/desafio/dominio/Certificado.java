package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private Curso curso;
    private Dev dev;
    private LocalDate dataConclusao = LocalDate.now();

    public Certificado(Curso curso, Dev dev) {
        this.curso = curso;
        this.dev = dev;
    }

    public void emitirCertificado() {
        System.out.printf("Certificamos de que: %s em %s, concluiu o curso \"%s\" com carga horaria de %d horas.\n",
                dev.getNome(),
                dataConclusao,
                curso.getTitulo(),
                curso.getCargaHoraria());
    }
}
