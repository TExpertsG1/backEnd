package br.com.hotel1800.dao;

import br.com.hotel1800.modelo.Cargo;
import br.com.hotel1800.modelo.FormaDePagamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class CargoDAO {

    @PersistenceContext
    private EntityManager em;

    public void create (Cargo cargo) throws SQLException { em.persist(cargo);}

    public Cargo read(Integer id) { return em.find(Cargo.class, id); }

    public List<Cargo> readAll() {
        return em.createQuery("SELECT c FROM Cargo c", Cargo.class).getResultList();
    }

    public void update(Cargo cargo) { em.merge(cargo); }

    public void delete(Integer id) {
        Cargo cargo = em.find(Cargo.class, id);
        em.remove(cargo);
    }

}