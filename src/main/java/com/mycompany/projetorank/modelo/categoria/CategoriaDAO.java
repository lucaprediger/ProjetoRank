package com.mycompany.projetorank.modelo.categoria;

import com.mycompany.projetorank.modelo.usuario.Usuario;
import java.util.List;

public interface CategoriaDAO {
	public Categoria salvar(Categoria categoria);
        
        public Categoria editar(Categoria categoria);

	public void excluir(Categoria categoria);

	public Categoria carregar(Integer categoria);

	public List<Categoria> listar(Usuario usuario);
}
