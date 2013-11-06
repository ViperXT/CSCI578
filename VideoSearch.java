/**
 * Project for CSCI578 by John & Nate
 * This project is publically available for download via GITHUB
 *
 * This program operates in two modes, building a database to match against, and
 * matching against that database. The database is a flat file deployed with the
 * final application executable, and should reside in the same folder at runtime
 *
 */

package videosearch;

/**
 * 
 * Comments: Feel free to toss some notes and stuff in here... just be aware
 * that it's a public project.
 * 
 *
 * @author John & Nate
 */
public class VideoSearch {

    static final boolean mode = false; // False for input, True for matching
    static final String databaseFileName = "db.txt"; // Database file
    /**
     * @param args the command line arguments
     * Should get the video file and audio file from cmd line
     * "Database" is represented by flat file hardcoded above - format is
     * TODO:
     * "filename","attr1","attr2","attr3"\n
     */
    public static void main(String[] args) {
        // TODO
        // args[0] - video file
        // args[1] - audio file
        
        if( mode ) { // Matching
            // Read in database, error if not present
            
            // Read in args[0] and args[1]
            
            // Run characterization on args
            
            // Match with characterizations in DB
            
            // Generate display including:
            //      Top 3 matches
            //      Best match displayed
            //      Which part of the video matches
            //      Play / Pause / Etc each video
            return;
        }
        
        // Not Matching
        // Open database file if it exists, if not create it
        
        // Read in command line argument - args[0] is video, args[1] is audio
        
        // Run Characterization on args
        
        // Format and Store characterization in DB - Append to file
        
    }
    
    // Function (maybe this should be a class?) to run to generate
    // the characterization information
    public static characterize( someVideoFormat ) {
        // iterate through frames
        // count H, S, V values - HSV is like RGB, but better for color compares
        // store?
    }
    
}
