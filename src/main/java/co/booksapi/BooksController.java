package co.booksapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.booksapi.dao.BooksDao;
import co.booksapi.dao.Volume;
import co.booksapi.entity.Items;
import co.booksapi.entity.VolumeInfo;

@Controller
public class BooksController {

	@Autowired
	private BooksService service;

	@Autowired
	private BooksDao dao;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/results")
	public ModelAndView results(@RequestParam("query") String query) {

		ModelAndView mav = new ModelAndView("results");

		List<VolumeInfo> books = new ArrayList<VolumeInfo>();
		for (Items item : service.items(query)) {
			books.add(item.getVolumeInfo());
		}

		List<Volume> volume = new ArrayList<Volume>();

		for (VolumeInfo volumes : books) {
			Volume vol = new Volume();
			vol.setTitle(volumes.getTitle());
			vol.setDescription(volumes.getDescription());
			vol.setPublisher(volumes.getPublisher());
			vol.setPublishedDate(volumes.getPublishedDate());
			vol.setPreviewLink(volumes.getPreviewLink());
			if (volumes.getAuthors() != null) {
				vol.setAuthor1(volumes.getAuthors().get(0));
				if (volumes.getAuthors().size() > 1) {
					vol.setAuthor1(volumes.getAuthors().get(1));
				}
			}

			if (volumes.getCategories() != null) {
				vol.setCategory1(volumes.getCategories().get(0));
				if (volumes.getCategories().size() > 1) {
					vol.setCategory2(volumes.getCategories().get(1));
				}
			}
			volume.add(vol);
			dao.create(vol);

		}

		mav.addObject("results", service.items(query));

		return mav;

	}

}
