package co.booksapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.booksapi.entity.VolumeInfo;

@Repository
@Transactional
public class BooksDao {

	@PersistenceContext
	private EntityManager em;

	public List<VolumeInfo> allBooks() {

		return em.createQuery("FROM VolumeInfo", VolumeInfo.class).getResultList();

	}

	public void create(Volume volumes) {
		em.persist(volumes);
	}

}
