package bean.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

	@Autowired
	@MovieQualifier(genre = "action", format = Format.VSH)
	MovieCatalog actionVshMovie;
	@Autowired
	@MovieQualifier(genre = "comedy", format = Format.VSH)
	MovieCatalog comedyVshMovie;
	@Autowired
	@MovieQualifier(genre = "action", format = Format.DVD)
	MovieCatalog actionDvdMovie;
	@Autowired
	@MovieQualifier(genre = "comedy", format = Format.DVD)
	MovieCatalog comedyDvdMovie;
	@Autowired
	@customQualifier("testCustomQualifier")
	MovieCatalog CustomQualifier;

	public MovieCatalog getCustomQualifier() {
		return CustomQualifier;
	}

	public void setCustomQualifier(MovieCatalog customQualifier) {
		CustomQualifier = customQualifier;
	}

	public MovieCatalog getActionVshMovie() {
		return actionVshMovie;
	}

	public void setActionVshMovie(MovieCatalog actionVshMovie) {
		this.actionVshMovie = actionVshMovie;
	}

	public MovieCatalog getComedyVshMovie() {
		return comedyVshMovie;
	}

	public void setComedyVshMovie(MovieCatalog comedyVshMovie) {
		this.comedyVshMovie = comedyVshMovie;
	}

	public MovieCatalog getActionDvdMovie() {
		return actionDvdMovie;
	}

	public void setActionDvdMovie(MovieCatalog actionDvdMovie) {
		this.actionDvdMovie = actionDvdMovie;
	}

	public MovieCatalog getComedyDvdMovie() {
		return comedyDvdMovie;
	}

	public void setComedyDvdMovie(MovieCatalog comedyDvdMovie) {
		this.comedyDvdMovie = comedyDvdMovie;
	}

}
