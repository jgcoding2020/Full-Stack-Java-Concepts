package cogent.infotech.com.annotations;

import org.springframework.stereotype.Component;

@Component("history")
public class HistoryService {

	public void store() {
		System.out.println("Storing history");
	}
}
