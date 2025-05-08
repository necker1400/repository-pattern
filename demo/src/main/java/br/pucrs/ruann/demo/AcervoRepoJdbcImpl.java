package br.pucrs.ruann.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AcervoRepoJdbcImpl implements IAcervoRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AcervoRepoJdbcImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Livro> getLivros() {
        List<Livro> resp = this.jdbcTemplate.query("SELECT * FROM livros",
            (rs, rowNum) -> new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
                rs.getInt("ano")));
        return resp;
    }

    @Override
    public boolean removeLivro(int id) {
        String sql = "DELETE FROM livros WHERE id = " + id;
        this.jdbcTemplate.batchUpdate(sql);
        return true;
    }
    // Implemente os demais métodos, o mínimo para compilar
    @Override
    public List<String> getTitulos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulos'");
    }
    @Override
    public List<String> getAutores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAutores'");
    }
    @Override
    public List<Livro> getLivrosDoAutor(String autor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivrosDoAutor'");
    }
    @Override
    public List<Livro> getLivrosDoAutor(String autor, int ano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivrosDoAutor'");
    }
    @Override
    public Livro getLivroTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivroTitulo'");
    }
    @Override
    public boolean cadastraLivroNovo(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastraLivroNovo'");
    }
}