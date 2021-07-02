package dominio;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString()

public class Usuario {
    private List<Conta> contas;
    private String nome;
    private Integer idade;
    private String caminhoArquivo;

}
