import java.io.File;

/**
 * Symptom Tracker - Symptom
 *
 * This class defines the Symptom object for this application
 *
 * @author Killian Meaney
 * @version January 3rd, 2022
 */

//TODO: need to flush out what information the Symptom object needs to keep track of, and how it will do that

public class Symptom {
    private String name; //name of the symptom
    private String startDate; //date symptom started
    private String endDate; //date symptom ended
    private File severityLog; //file for log of all times severity of symptom was recorded
    private File commentLog; //file for log of all comments on symptom
    private File frequencyLog; //file for log of all times frequency of symptom was recorded

    public Symptom (String name, String startDate, String endDate,
                    String severityLogFN, String commentLogFN, String frequencyLogFN) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate; //note: endDate can be null (signifies that symptom is ongoing)
        if ((severityLogFN == null) && (commentLogFN == null) && (frequencyLogFN == null)) {
            //if this is a new symptom instance...
            //TODO: generate new filenames (need some sort of naming convention)
        }
        this.severityLog = new File(severityLogFN);
        this.commentLog = new File(commentLogFN);
        this.frequencyLog = new File(frequencyLogFN);

    }


}
