import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    @Test
    void deveSomarQuantidadeAoEstoque() {
        Funcionario funcionario = new Funcionario();
        funcionario.adicionarEstoque(100, 20);
        assertEquals(120, funcionario.getQuantidadeEstoque());
    }

    @Test
    void deveSubtrairQuantidadeAoEstoque() {
        Funcionario funcionario = new Funcionario();
        funcionario.subtrairEstoque(100, 20);
        assertEquals(80, funcionario.getQuantidadeEstoque());
    }

}
