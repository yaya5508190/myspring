package bean.annotation.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

	@Autowired
	@MovieQualifier(genre = "action", format = Format.VSH)
	MovieCatalog actionVshMovie;

	@Autowired
	@MovieQualifier(genre = "action", format = Format.DVD)
	MovieCatalog actionDvdMovie;

	public MovieCatalog getActionVshMovie() {
		return actionVshMovie;
	}

	public void setActionVshMovie(MovieCatalog actionVshMovie) {
		this.actionVshMovie = actionVshMovie;
	}

	public MovieCatalog getActionDvdMovie() {
		return actionDvdMovie;
	}

	public void setActionDvdMovie(MovieCatalog actionDvdMovie) {
		this.actionDvdMovie = actionDvdMovie;
	}

}
