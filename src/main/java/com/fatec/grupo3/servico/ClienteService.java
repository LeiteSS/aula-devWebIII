package com.fatec.grupo3.servico;

import java.util.List;
import java.util.Optional;

import com.fatec.grupo3.model.Cliente;

public interface ClienteService {
 List<Cliente> consultaTodos();
 Optional<Cliente> consultaPorCpf(String cpf);
 Optional<Cliente> consultaPorId(Long id);
 Optional<Cliente> save(Cliente cliente);
 void delete (Long id);
 Optional<Cliente> atualiza ( Cliente cliente);
}

